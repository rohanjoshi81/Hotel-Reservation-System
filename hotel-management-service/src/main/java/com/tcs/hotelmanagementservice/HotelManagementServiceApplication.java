package com.tcs.hotelmanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HotelManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelManagementServiceApplication.class, args);
	}

}
