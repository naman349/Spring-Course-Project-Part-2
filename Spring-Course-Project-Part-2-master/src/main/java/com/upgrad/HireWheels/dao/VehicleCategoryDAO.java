package com.upgrad.HireWheels.dao;

import com.upgrad.HireWheels.entities.VehicleCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("vehicleCategoryDAO")
public interface VehicleCategoryDAO extends JpaRepository<VehicleCategory, Integer> {
VehicleCategory findByVehicleCategoryName(String category);
}
