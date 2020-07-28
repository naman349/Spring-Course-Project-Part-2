package com.upgrad.HireWheels.util;

import com.upgrad.HireWheels.dto.UserDTO;
import com.upgrad.HireWheels.entities.User;
import org.springframework.stereotype.Component;

@Component
public class DTOEntityMapper {

    public User convertToUserEntity(UserDTO userDTO){
        User user = new User();
        user.setPassword(userDTO.getPassword());
        user.setWalletMoney(userDTO.getWalletMoney());
        user.setEmail(userDTO.getEmail());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        return user;
    }

}
