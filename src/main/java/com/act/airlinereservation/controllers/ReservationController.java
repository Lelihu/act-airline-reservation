package com.act.airlinereservation.controllers;

import com.act.airlinereservation.domains.Reservation;
import com.act.airlinereservation.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping("/api/reservation/create")
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationService.createReservation(reservation);
    }

    @GetMapping("/api/reservation/list")
    public Iterable<Reservation> listReservations() {

        return reservationService.allReservations();
    }
}
