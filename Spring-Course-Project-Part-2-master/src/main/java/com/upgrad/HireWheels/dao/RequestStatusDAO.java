package com.upgrad.HireWheels.dao;

import com.upgrad.HireWheels.entities.RequestStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("requestStatusDAO")
public interface RequestStatusDAO extends JpaRepository<RequestStatus, Integer> {
}
