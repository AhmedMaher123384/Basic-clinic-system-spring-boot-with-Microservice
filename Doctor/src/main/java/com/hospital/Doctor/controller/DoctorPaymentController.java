package com.hospital.Doctor.controller;

import com.hospital.Doctor.model.dto.AddPayment;
import com.hospital.Doctor.model.dto.PaymentDto;
import com.hospital.Doctor.services.DoctorPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoctorPaymentController {

    @Autowired
    private DoctorPaymentService doctorPaymentService;

    @GetMapping("/get-payment/{tranid}")
    public ResponseEntity<PaymentDto> get(@PathVariable ("tranid") String tranid){
        return doctorPaymentService.get(tranid);
    }


    @PostMapping("/add-payment")
    public ResponseEntity<PaymentDto> save(@RequestBody AddPayment addPayment) {
        return this.doctorPaymentService.save(addPayment);
        }

}
