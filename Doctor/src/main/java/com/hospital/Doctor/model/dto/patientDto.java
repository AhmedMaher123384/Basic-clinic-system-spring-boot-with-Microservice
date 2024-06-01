package com.hospital.Doctor.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class patientDto {
    private Long id;
    private String patientName;
    private int patientAge;
}
