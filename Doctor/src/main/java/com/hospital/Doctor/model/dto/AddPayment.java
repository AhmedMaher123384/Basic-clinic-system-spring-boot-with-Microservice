package com.hospital.Doctor.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AddPayment {
    private Double amount;
    private Long patientId;
}
