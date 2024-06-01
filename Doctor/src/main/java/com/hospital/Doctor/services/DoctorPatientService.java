package com.hospital.Doctor.services;

import com.hospital.Doctor.Proxy.PatientProxy;
import com.hospital.Doctor.model.dto.AddPatientDto;
import com.hospital.Doctor.model.dto.patientDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class DoctorPatientService {

    @Autowired
       private PatientProxy patientProxy;
    public ResponseEntity<patientDto> getPatient (Long id){
        return this.patientProxy.getPatient(id);
    }

    public ResponseEntity<patientDto> save(AddPatientDto addPatientDto){
        return this.patientProxy.save(addPatientDto);
    }

}
