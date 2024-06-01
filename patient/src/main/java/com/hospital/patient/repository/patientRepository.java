package com.hospital.patient.repository;

import com.hospital.patient.model.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface patientRepository extends JpaRepository<Patient,Long> {

}
