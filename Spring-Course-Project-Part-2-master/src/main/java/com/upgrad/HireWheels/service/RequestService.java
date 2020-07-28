package com.upgrad.HireWheels.service;

import com.upgrad.HireWheels.dto.VehicleDTO;
import com.upgrad.HireWheels.entities.Vehicle;


public interface RequestService {
    Vehicle addVehicleRequest(VehicleDTO vehicle);
}
