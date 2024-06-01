package com.hospital.Payment.services;

import com.hospital.Payment.model.dto.AddPayment;
import com.hospital.Payment.model.dto.PaymentDto;
import com.hospital.Payment.model.entity.Payment;
import com.hospital.Payment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public PaymentDto get(String tranid){
        Optional<Payment> payment =this.paymentRepository.findByTranId(tranid);
        PaymentDto paymentDto = PaymentDto.builder()
                .id(payment.get().getId())
                .amount(payment.get().getAmount())
                .patientId(payment.get().getPatientId())
                .tranId(payment.get().getTranId())
                .build();

        return paymentDto;
    }

    public PaymentDto save(AddPayment addPayment){
        String TRAN_ID = UUID.randomUUID().toString();
        PaymentDto paymentDto = PaymentDto.builder()
                .tranId(TRAN_ID)
                .patientId(addPayment.getPatientId())
                .amount(addPayment.getAmount())
                .build();

        Payment payment = Payment.builder()
                .amount(paymentDto.getAmount())
                .patientId(paymentDto.getPatientId())
                .tranId(paymentDto.getTranId())
                .build();

        Payment entity = this.paymentRepository.save(payment);

        PaymentDto dto = PaymentDto.builder()
                .id(entity.getId())
                .tranId(entity.getTranId())
                .patientId(entity.getPatientId())
                .amount(entity.getAmount())
                .build();

        return dto;
    }

    public List<PaymentDto> getPatientPayments(Long patient_id){

        List<Payment> payments = this.paymentRepository.findAllByPatientId(patient_id);
        List<PaymentDto> paymentsDto = toDtoList(payments);
        return paymentsDto;

    }


    public  List<PaymentDto> toDtoList(List<Payment> payments) {

        List<PaymentDto> paymentDtos = payments.stream().map(payment -> {
            PaymentDto dto = new PaymentDto();
            dto.setId(payment.getId());
            dto.setAmount(payment.getAmount());
            dto.setPatientId(payment.getPatientId());
            dto.setTranId(payment.getTranId());
            return dto;
        }).collect(Collectors.toList());


        return paymentDtos ;

    }




}
