package com.upgrad.HireWheels;

import com.upgrad.HireWheels.service.InitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HireWheelsApplication implements CommandLineRunner {

	@Autowired
	InitService initService;

	public static void main(String[] args) {
		SpringApplication.run(HireWheelsApplication.class, args);
	}

	@Override
	public void run(String... arg){
		initService.start();
	}

}
