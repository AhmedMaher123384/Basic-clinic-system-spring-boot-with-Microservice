package com.hospital.patient.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddPatientDto {

    private String patientName;
    private int patientAge;
}
