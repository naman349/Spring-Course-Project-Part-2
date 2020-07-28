package com.upgrad.HireWheels.dao;

import com.upgrad.HireWheels.entities.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRoleDAO")
public interface UserRoleDAO extends JpaRepository<UserRole, Integer> {
}
