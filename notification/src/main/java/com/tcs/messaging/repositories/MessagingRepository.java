package com.tcs.messaging.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.messaging.entities.Messaging;

import java.util.List;

@Repository
public interface MessagingRepository extends JpaRepository<Messaging, Long> {

    List<Messaging> findByCustomerId(Long customerId);

}