package com.idaira.reservationmicroservice.repository;
import com.idaira.reservationmicroservice.entity.Reservation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}
