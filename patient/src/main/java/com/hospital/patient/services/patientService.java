package com.hospital.patient.services;

import com.hospital.patient.model.dto.AddPatientDto;
import com.hospital.patient.model.dto.UpdatePatientDto;
import com.hospital.patient.model.dto.patientDto;
import com.hospital.patient.model.entity.Patient;
import com.hospital.patient.repository.patientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class patientService {

    @Autowired
    private patientRepository patientRepository;

    public patientDto save(AddPatientDto addPatientDto){
        Patient entity = Patient.builder()
                .patientName(addPatientDto.getPatientName())
                .patientAge(addPatientDto.getPatientAge())
                .build();

        Patient patient= this.patientRepository.save(entity);

        patientDto dto = patientDto.builder()
                .id(patient.getId())
                .patientName(patient.getPatientName())
                .patientAge(patient.getPatientAge())
                .build();
        return dto;
    }

    public UpdatePatientDto update(UpdatePatientDto updatePatientDto){
        Patient entity = Patient.builder()
                .id(updatePatientDto.getId())
                .patientName(updatePatientDto.getPatientName())
                .patientAge(updatePatientDto.getPatientAge())
                .build();

        Patient patient= this.patientRepository.save(entity);

        UpdatePatientDto dto = UpdatePatientDto.builder()
                .id(patient.getId())
                .patientName(patient.getPatientName())
                .patientAge(patient.getPatientAge())
                .build();
        return dto;
    }


    public String delete(Long id){

        this.patientRepository.deleteById(id);
        return "this patient"+id+ "is removed";
    }


    public patientDto getPatient (Long id){
        Patient patient = this.patientRepository.findById(id).get();
        patientDto dto = patientDto.builder()
                .id(patient.getId())
                .patientName(patient.getPatientName())
                .patientAge(patient.getPatientAge())
                .build();
        return dto;
    }


}
