package com.tcs.payment.repository;

import com.tcs.payment.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

	List<Payment> findByCustomerId(Long customerId);
}
