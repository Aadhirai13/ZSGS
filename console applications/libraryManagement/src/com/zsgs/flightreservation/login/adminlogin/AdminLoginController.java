package com.zsgs.flightreservation.login.adminlogin;

import com.zsgs.flightreservation.dto.Admin;

public class AdminLoginController implements AdminModelControllerCallBack, AdminViewControllerCallBack {
    private AdminControllerViewCallBack adminLoginView;
    private AdminControllerModelCallBack adminLoginModel;
    public AdminLoginController(AdminLoginView adminLoginView){
        this.adminLoginView = adminLoginView;
        adminLoginModel = new AdminLoginModel(this);
    }

    public void checkAdminCredentials(String adminUserName , String adminPassword){
        adminLoginModel.checkAdminCredentials(adminUserName , adminPassword);
    }

    public void adminLoginSuccess(Admin adminUser) {
        adminLoginView.adminLoginSuccess(adminUser);
    }

    public void adminLoginFailure(String invalidAdminCredentials) {
        adminLoginView.adminLoginFailure(invalidAdminCredentials);
    }
}
