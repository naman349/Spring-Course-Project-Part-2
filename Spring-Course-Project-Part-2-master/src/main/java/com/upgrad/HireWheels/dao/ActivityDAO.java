package com.upgrad.HireWheels.dao;

import com.upgrad.HireWheels.entities.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("activityDAO")
public interface ActivityDAO extends JpaRepository<Activity, Integer> {
}
