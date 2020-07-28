package com.upgrad.HireWheels.dao;

import com.upgrad.HireWheels.entities.AdminRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("adminRequestDAO")
public interface AdminRequestDAO extends JpaRepository<AdminRequest, Integer> {
}
