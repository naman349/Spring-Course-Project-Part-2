package com.upgrad.HireWheels.validator;

import com.upgrad.HireWheels.dto.AdminActivityDTO;
import com.upgrad.HireWheels.exceptions.advice.GlobalExceptionHandler;

public interface AdminValidator {
    void validateGetAllApprovals(int requestId) throws GlobalExceptionHandler;
    void validateUpdateVehicleRequest(AdminActivityDTO vehicle, int requestId) throws GlobalExceptionHandler;
}
