package com.zsgs.flightreservation.login.userlogin.newuser;

import com.zsgs.flightreservation.login.userlogin.reserveflights.ReserveFlightView;

import java.util.Scanner;

public class NewUserView implements NewUserControllerViewCallBack {

    private Scanner scanner = new Scanner(System.in);

    private NewUserViewControllerCallBack newUserController;

    private ReserveFlightView reserveFlightView;
    public NewUserView(){
        newUserController = new NewUserController(this);
        reserveFlightView = new ReserveFlightView();
    }
    public void viewNewUserSigninDetails() {
        System.out.println("------- New User sign-Up -------");
        System.out.println("Enter user name , email ID and password for register your account");
        String userName = scanner.next();
        String userEmailID = scanner.next();
        String userPassword = scanner.next();
        newUserController.setNewUserCredentials(userName , userEmailID , userPassword);
    }

    public void newUserRegisterSuccess(){
        System.out.println("Registered Successfully !");
        reserveFlightView.reserveFlight();
    }

    public void newUserRegisterFailure(String invalidUserId){
        System.out.println(invalidUserId);
        viewNewUserSigninDetails();
    }
}
