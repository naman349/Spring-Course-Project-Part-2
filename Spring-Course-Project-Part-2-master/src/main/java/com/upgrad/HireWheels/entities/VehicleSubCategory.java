package com.upgrad.HireWheels.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "VEHICLESUBCATEGORY")
public class VehicleSubCategory {
    @Id
    int id;
    @Column(nullable = false, unique = true)
    String vehicleSubCategoryName;
    @Column(nullable = false)
    int pricePerHour;
    @ManyToOne
    VehicleCategory vehicleCategory;
    @OneToMany(mappedBy = "vehicleSubCategory" , fetch = FetchType.LAZY)
    List<Vehicle> vehicleList;
}
