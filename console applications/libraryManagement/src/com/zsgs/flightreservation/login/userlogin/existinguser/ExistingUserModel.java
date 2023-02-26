package com.zsgs.flightreservation.login.userlogin.existinguser;

import com.zsgs.flightreservation.dto.User;
import com.zsgs.flightreservation.repository.AirlinesRepository;

public class ExistingUserModel implements ExistingUserControllerModelCallBack{
    private ExistingUserModelControllerCallBack existingUserController;
    public ExistingUserModel(ExistingUserController existingUserController){
        this.existingUserController = existingUserController;
    }

    public void checkexistingUserCredentials(String userName , String userPassword){
        User user = AirlinesRepository.getInstance().checkValidUser(userName , userPassword);
        if (user !=null) {
            existingUserController.existingUserLoginSuccess(user);
        } else {
            existingUserController.existingUserLoginFailure("\nInvalid Credentials. Please try again!\n");
        }
    }
}
