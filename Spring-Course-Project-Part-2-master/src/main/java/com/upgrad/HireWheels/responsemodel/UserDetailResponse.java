package com.upgrad.HireWheels.responsemodel;

import lombok.Data;


@Data
public class UserDetailResponse {
    int userId;
    String firstName;
    String lastName;
    String email;
    String mobileNumber;
    int walletMoney;
    String successMessage;
    String roleName;
    String jwtToken;
    String refreshToken;
}
