package com.hospital.Doctor.Proxy;

import com.hospital.Doctor.model.dto.AddPayment;
import com.hospital.Doctor.model.dto.PaymentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.MediaSize;

@FeignClient(name = "PAYMENT-SERVICE" , path = "/payment")
public interface PaymentProxy {

    @GetMapping("/{tranid}")
    public ResponseEntity<PaymentDto> get(@PathVariable("tranid") String tranid) ;


    @PostMapping("/")
    public ResponseEntity<PaymentDto> save(@RequestBody AddPayment addPayment) ;
}
