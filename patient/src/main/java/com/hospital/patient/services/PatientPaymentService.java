package com.hospital.patient.services;

import com.hospital.patient.model.dto.PaymentDto;
import com.hospital.patient.proxy.PaymentProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientPaymentService {
    @Autowired
    private PaymentProxy paymentproxy;

    public ResponseEntity<List<PaymentDto>> getPatientPayments(Long patient_id) {
        return this.paymentproxy.getPatientPayments(patient_id);
    }

    public ResponseEntity<String> hi(){
         return this.paymentproxy.hi();
    }
}
