package com.zsgs.flightreservation.login.adminlogin;

import com.zsgs.flightreservation.dto.Admin;

public interface AdminControllerViewCallBack {
    void adminLoginSuccess(Admin adminUser);

    void adminLoginFailure(String invalidAdminCredentials);
}
