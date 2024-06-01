package com.hospital.patient.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PaymentDto {

    private Long id;
    private String tranId;
    private Double amount;
    private Long patientId;
}
