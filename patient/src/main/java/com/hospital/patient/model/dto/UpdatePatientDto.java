package com.hospital.patient.model.dto;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdatePatientDto {

    private Long id;
    private String patientName;
    private int patientAge;
}

