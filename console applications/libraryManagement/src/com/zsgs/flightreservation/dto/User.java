package com.zsgs.flightreservation.dto;

public class User {

    private String userName;
    private String userEmailId;
    private String userPassword;

    public User(String userName , String userEmailId , String userPassword){
        setUserName(userName);
        setUserEmailId(userEmailId);
        setUserPassword(userPassword);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmailId() {
        return userEmailId;
    }

    public void setUserEmailId(String userEmailId) {
        this.userEmailId = userEmailId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
