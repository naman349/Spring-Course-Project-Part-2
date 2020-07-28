package com.upgrad.HireWheels.responsemodel;

import lombok.Data;

@Data
public class AdminRequestResponse {
    int requestId;
    String userComments;
    String adminComments;
    int requestStatusId;
    int vehicleId;
    String vehicleModel;
    String vehicleNumber;
    String carImageUrl;
    int activityId;
}
