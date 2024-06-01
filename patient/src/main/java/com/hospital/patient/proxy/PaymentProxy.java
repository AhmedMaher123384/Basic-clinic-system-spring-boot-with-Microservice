package com.hospital.patient.proxy;

import com.hospital.patient.model.dto.PaymentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "PAYMENT-SERVICE", path = "/payment")
public interface PaymentProxy {

    @GetMapping("/get-all")
    public ResponseEntity<List<PaymentDto>> getPatientPayments(@RequestParam Long patient_id);


    @GetMapping("/hi")
    public ResponseEntity<String> hi();

    }
