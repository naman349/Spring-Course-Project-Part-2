package com.upgrad.HireWheels.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name= "FUELTYPE")
public class FuelType {
    @Id
    int id;
    @Column( nullable = false)
    private String fuelType;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fuelType")
    List<Vehicle> vehicles;

}

