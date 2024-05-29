package com.tcs.messaging.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.messaging.entities.Messaging;

@Repository
public interface MessagingRepo extends JpaRepository<Messaging, Long>{

}
