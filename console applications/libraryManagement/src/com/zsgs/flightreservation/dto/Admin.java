package com.zsgs.flightreservation.dto;

public class Admin {

    private String adminName;
    private String adminPassword;

    public Admin(String adminName , String adminPassword){
        setAdminName(adminName);
        setAdminPassword(adminPassword);
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
