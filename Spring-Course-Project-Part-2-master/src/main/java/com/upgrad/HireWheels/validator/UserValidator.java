package com.upgrad.HireWheels.validator;

import com.upgrad.HireWheels.dto.ForgetPWDDTO;
import com.upgrad.HireWheels.dto.UserDTO;
import com.upgrad.HireWheels.exceptions.advice.GlobalExceptionHandler;

public interface UserValidator {
   void validateUserSignUp(UserDTO user) throws GlobalExceptionHandler;
   void validateChangePassword(ForgetPWDDTO user) throws GlobalExceptionHandler;
}
