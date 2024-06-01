package com.hospital.Doctor.controller;

import com.hospital.Doctor.model.dto.AddPatientDto;
import com.hospital.Doctor.model.dto.patientDto;
import com.hospital.Doctor.services.DoctorPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoctorPatientController {

    @Autowired
    private DoctorPatientService doctorPatientService;
    @GetMapping("/get-patient")
    public ResponseEntity<patientDto> getPatient (@RequestParam Long id){
        return this.doctorPatientService.getPatient(id);
    }

    @PostMapping("/add-patient")
    public ResponseEntity<patientDto> save(@RequestBody AddPatientDto addPatientDto){
        return this.doctorPatientService.save(addPatientDto);

    }
}
