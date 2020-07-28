package com.upgrad.HireWheels.service;

import com.upgrad.HireWheels.exceptions.advice.GlobalExceptionHandler;
import com.upgrad.HireWheels.responsemodel.VehicleDetailResponse;

import java.util.Date;
import java.util.List;

public interface VehicleService {
    List<VehicleDetailResponse> getAvailableVehicles(String categoryName, Date pickUpDate, Date dropDate, int locationId) throws GlobalExceptionHandler;
    List<VehicleDetailResponse> getAllVehicleByUserId(int userId) throws GlobalExceptionHandler;
}
