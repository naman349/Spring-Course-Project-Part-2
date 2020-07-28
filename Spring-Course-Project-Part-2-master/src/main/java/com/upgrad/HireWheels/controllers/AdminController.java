package com.upgrad.HireWheels.controllers;


import com.upgrad.HireWheels.service.AdminService;
import com.upgrad.HireWheels.validator.AdminValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AdminController {

    @Autowired
    AdminService adminService;

    @Autowired
    AdminValidator adminValidator;

    private static final Logger logger = LoggerFactory.getLogger(com.upgrad.HireWheels.controllers.AdminController.class);

}
