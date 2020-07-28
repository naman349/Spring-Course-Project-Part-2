package com.upgrad.HireWheels.dao;

import com.upgrad.HireWheels.entities.Booking;
import com.upgrad.HireWheels.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("bookingDAO")
public interface BookingDAO extends JpaRepository<Booking, Integer> {
 List<Booking> findByVehicleWithBooking(Vehicle vehicle);
}
