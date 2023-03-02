package com.idaira.reservationmicroservice.controller;

import com.idaira.reservationmicroservice.entity.Reservation;
import com.idaira.reservationmicroservice.service.ReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    private final ReservationService reservationService;

    @PostMapping
    public Reservation createReservation(@RequestBody Reservation reservation){
        return reservationService.createReservation(reservation);
    }

    @GetMapping("/{id}")
    public Reservation getById(@PathVariable Integer id){
        return reservationService.getReservation(id);
    }

    @GetMapping
    public List<Reservation> getAll(){
        return reservationService.getAllReservations();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        reservationService.deleteReservation(id);
    }

}
