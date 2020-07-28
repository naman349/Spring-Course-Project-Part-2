package com.upgrad.HireWheels.validator;

import com.upgrad.HireWheels.dto.BookingDTO;

import java.text.ParseException;

public interface BookingValidator {
    void validateBooking(BookingDTO vehicle) throws ParseException;
    void validateBookingHistory(int userId);
}
