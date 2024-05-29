package com.tcs.messaging.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.messaging.entities.Messaging;
import com.tcs.messaging.service.MessagingService;

import java.util.List;

@RestController
@RequestMapping("/notifications")
public class MessagingController {

	@Autowired
    MessagingService messagingService;
	
    @PostMapping("/send")
    public String sendNotification() {
		return null;
    }
    
    @GetMapping("/customer/{customerId}")
    public List<Messaging> getNotificationBycautomerId(@PathVariable Long customerId) {
		return messagingService.getAllNotifications(customerId);
    }
    
}
