package com.hospital.Doctor.services;

import com.hospital.Doctor.Proxy.PaymentProxy;
import com.hospital.Doctor.model.dto.AddPayment;
import com.hospital.Doctor.model.dto.PaymentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
public class DoctorPaymentService {
    @Autowired
    private PaymentProxy paymentProxy;

    public ResponseEntity<PaymentDto> get(String tranid) {
        return this.paymentProxy.get(tranid);
    }


    public ResponseEntity<PaymentDto> save(AddPayment addPayment) {
        return this.paymentProxy.save(addPayment);    }

}

