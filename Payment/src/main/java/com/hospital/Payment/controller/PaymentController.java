package com.hospital.Payment.controller;

import com.hospital.Payment.model.dto.AddPayment;
import com.hospital.Payment.model.dto.PaymentDto;
import com.hospital.Payment.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;
    @GetMapping("/hi")
    public ResponseEntity<String> hi(){
        return  new ResponseEntity<>("its work",HttpStatus.OK);
    }

    @GetMapping("/{tranid}")
    public ResponseEntity<PaymentDto> get(@PathVariable ("tranid") String tranid) {
        try {
            PaymentDto payment = paymentService.get(tranid);
            return new ResponseEntity<>(payment, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping("/")
    public ResponseEntity<PaymentDto> save(@RequestBody AddPayment addPayment) {
        return new ResponseEntity<>(this.paymentService.save(addPayment) , HttpStatus.CREATED);
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<PaymentDto>> getPatientPayments(@RequestParam Long patient_id){
        return new ResponseEntity<>(this.paymentService.getPatientPayments(patient_id) , HttpStatus.OK);
    }

    }


