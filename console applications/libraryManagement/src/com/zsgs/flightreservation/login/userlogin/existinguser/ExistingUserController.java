package com.zsgs.flightreservation.login.userlogin.existinguser;

import com.zsgs.flightreservation.dto.User;

public class ExistingUserController implements ExistingUserViewControllerCallBack , ExistingUserModelControllerCallBack{
    private ExistingUserControllerViewCallBack existingUserView;
    private ExistingUserControllerModelCallBack existingUserModel;
    public ExistingUserController(ExistingUserView existingUserView){
        this.existingUserView = existingUserView;
        existingUserModel = new ExistingUserModel(this);
    }

    public void checkexistingUserCredentials(String userName , String userPassword){
        existingUserModel.checkexistingUserCredentials(userName , userPassword);
    }

    public void existingUserLoginSuccess(User user) {
        existingUserView.existingUserLoginSuccess(user);
    }

    public void existingUserLoginFailure(String invalidExistingUserCredentials) {
        existingUserView.existingUserLoginFailure(invalidExistingUserCredentials);
    }
}
