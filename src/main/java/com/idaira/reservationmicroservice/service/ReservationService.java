package com.idaira.reservationmicroservice.service;

import com.idaira.reservationmicroservice.entity.Reservation;
import com.idaira.reservationmicroservice.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public Reservation createReservation (Reservation reservation){
        return reservationRepository.save(reservation);
    }

    public Reservation getReservation (Integer id){
        return reservationRepository.findById(id).get();
    }

    public List<Reservation> getAllReservations(){
        return reservationRepository.findAll();
    }

    public void deleteReservation (Integer id){
        reservationRepository.deleteById(id);
    }


}
