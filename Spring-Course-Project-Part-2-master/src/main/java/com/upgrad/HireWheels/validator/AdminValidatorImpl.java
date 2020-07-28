package com.upgrad.HireWheels.validator;
import com.upgrad.HireWheels.dto.AdminActivityDTO;
import com.upgrad.HireWheels.exceptions.APIException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AdminValidatorImpl implements com.upgrad.HireWheels.validator.AdminValidator {

    List<Integer> requestIds = new ArrayList<>(Arrays.asList(301,302,303));
    List<Integer> activityIds = new ArrayList<>(Arrays.asList(201,202,203));

    @Override
    public void validateGetAllApprovals(int statusId) {
        if(!requestIds.contains(statusId)){
            throw new APIException("Not a Valid Status Id");
        }
    }

    @Override
    public void validateUpdateVehicleRequest(AdminActivityDTO adminActivityDTO, int requestId) {
        if (adminActivityDTO.getUserId() != 1){
            throw new APIException("Only Admin Can Update Requests");
        }
        if(requestId == 0){
            throw new APIException("Not a Valid Request Status Id");
        }
        if (!requestIds.contains(adminActivityDTO.getRequestStatusId())){
            throw new APIException("Not a Valid Status Id");
        }
        if (!activityIds.contains(adminActivityDTO.getActivityId())) {
            throw new APIException("Not a Valid Activity Id");
        }
    }
}
