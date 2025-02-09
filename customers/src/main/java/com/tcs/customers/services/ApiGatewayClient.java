package com.tcs.customers.services;

import com.tcs.customers.dto.Hotels;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "apigateway-service", url = "http://localhost:8888", path = "/")
public interface ApiGatewayClient {

    @GetMapping("/hotels/{hotelId}")
    public Hotels getHotel(@PathVariable Long hotelId);
}