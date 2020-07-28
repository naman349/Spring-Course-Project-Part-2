package com.upgrad.HireWheels.controllers;

import com.upgrad.HireWheels.dto.ForgetPWDDTO;
import com.upgrad.HireWheels.dto.UserDTO;
import com.upgrad.HireWheels.entities.User;
import com.upgrad.HireWheels.exceptions.advice.GlobalExceptionHandler;
import com.upgrad.HireWheels.responsemodel.CustomResponse;
import com.upgrad.HireWheels.service.UserService;
import com.upgrad.HireWheels.validator.UserValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class AuthenticationController{

    @Autowired
    UserService userService;


    private static final Logger logger = LoggerFactory.getLogger(com.upgrad.HireWheels.controllers.AuthenticationController.class);

    @Autowired
    UserValidator userValidator;


    @PostMapping("/users")
    public ResponseEntity userSignUp(@RequestBody UserDTO userDTO) throws GlobalExceptionHandler {
        ResponseEntity responseEntity = null;
            userValidator.validateUserSignUp(userDTO);
            User functionReturn = userService.createUser(userDTO);
            if (functionReturn != null) {
                CustomResponse response = new CustomResponse(new Date(), "User Successfully Signed Up", 200);
                responseEntity = new ResponseEntity(response, HttpStatus.OK);
            }
        return responseEntity;
    }

    @PutMapping("/users/password")
    public ResponseEntity changePassword(@RequestBody ForgetPWDDTO forgetPWDDTO) throws GlobalExceptionHandler {
        ResponseEntity responseEntity = null;
            userValidator.validateChangePassword(forgetPWDDTO);
            boolean functionReturn = userService.updatePassword(forgetPWDDTO);
            if (functionReturn == true) {
                CustomResponse response = new CustomResponse(new Date(), "Password Successfully Changed", 200);
                return new ResponseEntity(response, HttpStatus.OK);
            }
        return responseEntity;
    }
}
