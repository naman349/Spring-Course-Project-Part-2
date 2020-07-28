package com.upgrad.HireWheels.dao;

import com.upgrad.HireWheels.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("vehicleDAO")
public interface VehicleDAO extends JpaRepository<Vehicle, Integer> {
   boolean existsByVehicleNumber(String VehicleNumber);
}
