package com.upgrad.HireWheels.service;

import com.upgrad.HireWheels.dto.BookingDTO;
import com.upgrad.HireWheels.entities.Booking;
import com.upgrad.HireWheels.exceptions.advice.GlobalExceptionHandler;
import com.upgrad.HireWheels.responsemodel.BookingHistoryResponse;

import java.util.List;

public interface BookingService {
    Booking addBooking(BookingDTO booking) throws GlobalExceptionHandler;
    List<BookingHistoryResponse> bookingHistory(int userId) throws GlobalExceptionHandler;
}
