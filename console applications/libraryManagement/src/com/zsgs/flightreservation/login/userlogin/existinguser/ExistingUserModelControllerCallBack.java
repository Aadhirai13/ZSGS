package com.zsgs.flightreservation.login.userlogin.existinguser;

import com.zsgs.flightreservation.dto.User;

public interface ExistingUserModelControllerCallBack {
    void existingUserLoginSuccess(User user);

    void existingUserLoginFailure(String s);
}
