package com.zsgs.flightreservation.login.adminlogin;

import com.zsgs.flightreservation.dto.Admin;
import com.zsgs.flightreservation.repository.AirlinesRepository;

public class AdminLoginModel implements AdminControllerModelCallBack {
    private AdminModelControllerCallBack adminLoginController;
    public AdminLoginModel(AdminLoginController adminLoginController){
        this.adminLoginController = adminLoginController;
    }

    public void checkAdminCredentials(String adminUserName , String adminPassword){
        Admin adminUser = AirlinesRepository.getInstance().checkValidAdmin(adminUserName,adminPassword);
        if (adminUser !=null) {
            adminLoginController.adminLoginSuccess(adminUser);
        } else {
            adminLoginController.adminLoginFailure("\nInvalid Credentials. Please try again!\n");
        }
    }
}

