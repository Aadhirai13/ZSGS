package com.zsgs.flightreservation.login.userlogin.newuser;

public interface NewUserControllerViewCallBack {
    void newUserRegisterSuccess();

    void newUserRegisterFailure(String invalidUserId);
}
