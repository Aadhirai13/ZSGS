package com.zsgs.flightreservation.login.userlogin.newuser;

public class NewUserController implements  NewUserViewControllerCallBack , NewUserModelControllerCallBack{

    private NewUserControllerViewCallBack newUserView;
    private NewUserControllerModelCallBack newUserModel;

    public NewUserController(NewUserView newUserView){
        this.newUserView = newUserView;
        newUserModel = new NewUserModel(this);
    }

    public void setNewUserCredentials(String userName , String userEmailID , String userPassword){
        newUserModel.setNewUserCredentials(userName , userEmailID , userPassword);
    }

    public void newUserRegisterSuccess(){
        newUserView.newUserRegisterSuccess();
    }

    public void newUserRegisterFailure(String invalidUserId){
        newUserView.newUserRegisterFailure(invalidUserId);
    }
}
