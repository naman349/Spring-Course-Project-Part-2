package com.upgrad.HireWheels.dao;

import com.upgrad.HireWheels.entities.VehicleSubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("vehicleSubCategoryDAO")
public interface VehicleSubCategoryDAO extends JpaRepository<VehicleSubCategory, Integer> {
}
