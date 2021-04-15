package com.exer7um.restaurantapi.repositories;

import com.exer7um.restaurantapi.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
