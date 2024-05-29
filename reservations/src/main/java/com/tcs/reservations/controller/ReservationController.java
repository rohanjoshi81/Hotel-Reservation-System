package com.tcs.reservations.controller;

import com.tcs.reservations.entities.Reservation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable Long id) {
		return null;
    }
}
