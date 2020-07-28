package com.upgrad.HireWheels.dto;

import lombok.Data;

@Data
public class AdminRequestDTO {
    int activityId;
    String userComments;
    String adminComments;
    int userId;
}
