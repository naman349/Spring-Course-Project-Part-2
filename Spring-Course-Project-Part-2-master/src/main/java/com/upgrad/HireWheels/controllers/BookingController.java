package com.upgrad.HireWheels.controllers;

import com.upgrad.HireWheels.dto.BookingDTO;
import com.upgrad.HireWheels.entities.Booking;
import com.upgrad.HireWheels.exceptions.advice.GlobalExceptionHandler;
import com.upgrad.HireWheels.responsemodel.BookingHistoryResponse;
import com.upgrad.HireWheels.service.BookingService;
import com.upgrad.HireWheels.validator.BookingValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
public class BookingController {

    @Autowired
    BookingService bookingService;

    @Autowired
    BookingValidator bookingValidator;

    private static final Logger logger = LoggerFactory.getLogger(com.upgrad.HireWheels.controllers.BookingController.class);

    @PostMapping("/bookings")
    public ResponseEntity addBooking(@RequestBody BookingDTO bookingDTO) {
        ResponseEntity responseEntity = null;
        try {
            bookingValidator.validateBooking(bookingDTO);
            Booking responseBooking = bookingService.addBooking(bookingDTO);
            responseEntity = ResponseEntity.ok(responseBooking);
        } catch (ParseException | GlobalExceptionHandler e){
            logger.error(e.getMessage());
        }
        return responseEntity;
    }

    @GetMapping("/users/{userId}/bookings")
    public ResponseEntity bookingHistory(@PathVariable("userId") int userId) {
        ResponseEntity responseEntity = null;
        try {
             bookingValidator.validateBookingHistory(userId);
             List<BookingHistoryResponse> bookingList = bookingService.bookingHistory(userId);
             responseEntity = ResponseEntity.ok(bookingList);
        } catch (GlobalExceptionHandler e){
            logger.error(e.getMessage());
        }
        return responseEntity;
    }


}
