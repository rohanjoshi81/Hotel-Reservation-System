package com.tcs.messaging.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tcs.messaging.entities.Messaging;
import com.tcs.messaging.repositories.MessagingRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class MessagingService {
    @Autowired
    MessagingRepository messagingRepository;

    @KafkaListener(topics = "${spring.kafka.topic.name}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void customerNotify(String notificationPayload) {
        log.info("message {}", notificationPayload);

        ObjectMapper mapper = new ObjectMapper();
        Messaging notificationEvent = null;
        try {
            notificationEvent = mapper.readValue(notificationPayload, Messaging.class);
        } catch (JsonMappingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (notificationEvent != null) {
            notificationEvent.setCreatedOn(new Date().toString());
            messagingRepository.save(notificationEvent);
        } else {
            log.info("no message present");
        }

    }

    public List<Messaging> getAllNotifications(Long customerId) {
        return messagingRepository.findByCustomerId(customerId);
    }
}
