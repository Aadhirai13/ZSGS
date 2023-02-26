package com.zsgs.flightreservation.login.userlogin.existinguser;

import com.zsgs.flightreservation.dto.User;

public interface ExistingUserControllerViewCallBack {
    void existingUserLoginSuccess(User user);

    void existingUserLoginFailure(String invalidExistingUserCredentials);
}
