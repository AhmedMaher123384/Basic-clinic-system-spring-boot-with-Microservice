package com.hospital.Payment.model.dto;

import jakarta.persistence.Column;
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
