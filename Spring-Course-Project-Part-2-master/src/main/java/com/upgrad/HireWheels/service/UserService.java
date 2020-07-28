package com.upgrad.HireWheels.service;

import com.upgrad.HireWheels.dto.ForgetPWDDTO;
import com.upgrad.HireWheels.dto.UserDTO;
import com.upgrad.HireWheels.entities.User;
import com.upgrad.HireWheels.exceptions.advice.GlobalExceptionHandler;


public interface UserService{
    User createUser(UserDTO users) throws GlobalExceptionHandler;
    Boolean updatePassword(ForgetPWDDTO forgetPWDDTO) throws GlobalExceptionHandler;
}