package com.upgrad.HireWheels.util;

import com.upgrad.HireWheels.entities.Vehicle;
import com.upgrad.HireWheels.responsemodel.VehicleDetailResponse;
import org.springframework.stereotype.Component;

@Component
public class EntityDTOMapper {

    public VehicleDetailResponse convertToVehicleResponse(Vehicle vehicle){
        VehicleDetailResponse vehicleDetailResponse = new VehicleDetailResponse();
        vehicleDetailResponse.setCarImageUrl(vehicle.getCarImageUrl());
        vehicleDetailResponse.setColor(vehicle.getColor());
        //.....all other fiels
        return vehicleDetailResponse;
    }
}
