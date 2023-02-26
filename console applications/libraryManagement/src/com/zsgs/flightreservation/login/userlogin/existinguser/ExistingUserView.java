package com.zsgs.flightreservation.login.userlogin.existinguser;

import com.zsgs.flightreservation.dto.User;
import com.zsgs.flightreservation.login.userlogin.newuser.NewUserView;
import com.zsgs.flightreservation.login.userlogin.reserveflights.ReserveFlightView;

import java.util.Scanner;

public class ExistingUserView implements ExistingUserControllerViewCallBack{

    private Scanner scanner = new Scanner(System.in);

    private ExistingUserViewControllerCallBack existingUserController;
    private NewUserView newUserLoginView;
    private ReserveFlightView reserveFlightView;

    public ExistingUserView(){
        existingUserController = new ExistingUserController(this);
        newUserLoginView = new NewUserView();
        reserveFlightView = new ReserveFlightView();
    }

    public void viewExistingUserLoginDetails() {
        System.out.println("------- User Login -------");
        System.out.println("Press 1 to Login if you are an Registered User \nPress 2 to Sign-up if you are a New User\n");
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
            {
                System.out.println("Enter user name and password for login to your account");
                String userName = scanner.next();
                String userPassword = scanner.next();
                existingUserController.checkexistingUserCredentials(userName , userPassword);
                break;
            }
            case 2:
            {
                newUserLoginView.viewNewUserSigninDetails();
                break;
            }
        }
    }

    public void existingUserLoginSuccess(User user) {
        System.out.println("\n-->Welcome " + user.getUserName() + "<--\n");
        reserveFlightView.reserveFlight();
    }

    public void existingUserLoginFailure(String invalidUserCredentials){
        System.out.println(invalidUserCredentials);
        viewExistingUserLoginDetails();
    }
}