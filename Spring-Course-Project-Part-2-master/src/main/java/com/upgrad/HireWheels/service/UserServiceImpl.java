package com.upgrad.HireWheels.service;

import com.upgrad.HireWheels.dao.UserDAO;
import com.upgrad.HireWheels.dao.UserRoleDAO;
import com.upgrad.HireWheels.dto.ForgetPWDDTO;
import com.upgrad.HireWheels.dto.UserDTO;
import com.upgrad.HireWheels.entities.User;
import com.upgrad.HireWheels.exceptions.APIException;
import com.upgrad.HireWheels.exceptions.UserAlreadyExistsException;
import com.upgrad.HireWheels.util.DTOEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userDAO")
    UserDAO userDAO;

    @Autowired
    @Qualifier("userRoleDAO")
    UserRoleDAO userRoleDAO;

    @Autowired
    DTOEntityMapper dtoEntityMapper;

    /**
     * Checks if the userDTO mobile number/email is already exists or not. If not exists, saves the userDTO detail else throws an error.
     * @param userDTO
     * @return saved userDTO details.
     */

    public User createUser(UserDTO userDTO) {
            User returnedUser = userDAO.findByEmail(userDTO.getEmail());
                if ( returnedUser != null) {
                    throw new UserAlreadyExistsException("Email Already Exists");
                }
            User returnedUser1 = userDAO.findByMobileNo(userDTO.getMobileNo());
            if (returnedUser1 != null) {
                throw new UserAlreadyExistsException("Mobile Number Already Exists");
                }
            User newUser = dtoEntityMapper.convertToUserEntity(userDTO);
            User savedUser = userDAO.save(newUser);
            return savedUser;
    }

    /**
     * Checks if the user is registered or not. If registered it checks the new password is not equal to the current password.
     * If the password os different, it updates the password else throws an error.
     * @param forgetPWDDTO
     * @return
     */

    public Boolean updatePassword(ForgetPWDDTO forgetPWDDTO) {
            User user = userDAO.findByEmailAndMobileNo(forgetPWDDTO.getEmail(), forgetPWDDTO.getMobileNo());
            if(user == null){
                throw new APIException("Invalid Email/Mobile Number");
            }
            String currentPassword = user.getPassword();
                if(user != null && !currentPassword.equals(forgetPWDDTO.getPassword())) {
                    user.setPassword(forgetPWDDTO.getPassword());
                    userDAO.save(user);
                    return true;
                } else {
                    throw new APIException("The new password should be different from the existing one");
                }
    }

}
