package com.hospital.patient.controller;

import com.hospital.patient.model.dto.AddPatientDto;
import com.hospital.patient.model.dto.PaymentDto;
import com.hospital.patient.model.dto.UpdatePatientDto;
import com.hospital.patient.model.dto.patientDto;
import com.hospital.patient.services.PatientPaymentService;
import com.hospital.patient.services.patientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private patientService patientService;
    @Autowired
    private PatientPaymentService patientPaymentService;
    @GetMapping("/")
    public ResponseEntity<patientDto> getPatient (@RequestParam Long id){
        return new ResponseEntity<>(patientService.getPatient(id),HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<patientDto> save(@RequestBody AddPatientDto addPatientDto){
        return new ResponseEntity<>(patientService.save(addPatientDto),HttpStatus.CREATED);

    }
    @PutMapping("/")
    public ResponseEntity<UpdatePatientDto> update(@RequestBody UpdatePatientDto updatePatientDto){
        return new ResponseEntity<>(patientService.update(updatePatientDto),HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/")
        public ResponseEntity<String> delete(@RequestParam Long id){
        return new ResponseEntity<>(patientService.delete(id),HttpStatus.ACCEPTED);
    }


    @GetMapping("/get")
    public ResponseEntity<List<PaymentDto>> getPatientPayments(@RequestParam Long id){
        return this.patientPaymentService.getPatientPayments(id);
    }
    @GetMapping("/pay-hi")
    public ResponseEntity<String> hi(){
       return this.patientPaymentService.hi();
    }

}
