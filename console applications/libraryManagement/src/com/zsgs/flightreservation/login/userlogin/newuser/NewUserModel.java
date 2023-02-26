package com.zsgs.flightreservation.login.userlogin.newuser;

import com.zsgs.flightreservation.repository.AirlinesRepository;

public class NewUserModel implements NewUserControllerModelCallBack {

    private NewUserModelControllerCallBack newUserController;

    public NewUserModel(NewUserController newUserController){
        this.newUserController = newUserController;
    }
    public void setNewUserCredentials(String userName , String userEmailID , String userPassword){
        boolean registeredNewUser = AirlinesRepository.getInstance().registerNewUser(userName , userEmailID , userPassword);
        if(registeredNewUser)
            newUserController.newUserRegisterSuccess();
        else
            newUserController.newUserRegisterFailure("Invalid EmailID . Give valid Email ID to register");

    }

}
