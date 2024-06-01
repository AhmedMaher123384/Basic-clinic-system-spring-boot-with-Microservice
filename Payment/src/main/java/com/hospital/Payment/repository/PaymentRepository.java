package com.hospital.Payment.repository;

import com.hospital.Payment.model.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment,Long> {

    Optional<Payment> findByTranId(String transaction_id);
    List<Payment> findAllByPatientId(Long patient_id);
}
