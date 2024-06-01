package com.hospital.patient.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
@Builder
public class Patient {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        @Column(name = "patient_name")
        private String patientName;
        @Column(name = "patient_age")
        private int patientAge;


}
