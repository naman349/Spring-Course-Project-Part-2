package com.upgrad.HireWheels.validator;

import com.upgrad.HireWheels.dto.AdminRequestDTO;
import com.upgrad.HireWheels.dto.VehicleDTO;
import com.upgrad.HireWheels.exceptions.advice.GlobalExceptionHandler;

public interface RequestValidator {
    void validateChangeVehicleAvailability(AdminRequestDTO vehicle, int vehicleId) throws GlobalExceptionHandler;
    void validateAddVehicleRequest(VehicleDTO vehicleDTO) throws GlobalExceptionHandler;
}
