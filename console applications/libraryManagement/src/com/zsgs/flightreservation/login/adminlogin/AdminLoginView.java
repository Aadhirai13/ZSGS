package com.zsgs.flightreservation.login.adminlogin;

import com.zsgs.flightreservation.dto.Admin;
import com.zsgs.flightreservation.login.adminlogin.manageflights.ManageFlightsView;
import com.zsgs.flightreservation.login.userlogin.existinguser.ExistingUserView;

import java.util.Scanner;

public class AdminLoginView  implements AdminControllerViewCallBack {

    private AdminViewControllerCallBack adminLoginController;
    private ExistingUserView existingUserView;
    private ManageFlightsView manageFlightsView;
    private Scanner scanner = new Scanner(System.in);

    public AdminLoginView(){
        adminLoginController  = new AdminLoginController(this);
        existingUserView = new ExistingUserView();
        manageFlightsView = new ManageFlightsView();
    }

    static public void main(String[] args) {
        AdminLoginView adminLoginView = new AdminLoginView();
        adminLoginView.viewadminLoginDetails();
    }

    public void viewadminLoginDetails(){
        System.out.println("------- Welcome to ABC Airlines -------");
        System.out.println("Press 1 to Admin Login \nPress 2 to User Login\nPress 3 to exit \n");
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
            {
                System.out.println("------- Admin Login -------");
                System.out.println("Enter admin name and password for login to admin account");
                String adminUserName = scanner.next();
                String adminPassword = scanner.next();
                adminLoginController.checkAdminCredentials(adminUserName , adminPassword);
                break;
            }
            case 2:
            {
                existingUserView.viewExistingUserLoginDetails();
                break;
            }
            case 3:
            {
                System.exit(0);
            }
        }
    }

    public void adminLoginSuccess(Admin admin) {
        System.out.println("\n-->Welcome " + admin.getAdminName() + "<--\n");
        manageFlightsView.viewManageFlights();
    }

    public void adminLoginFailure(String invalidAdminCredentials){
        System.out.println(invalidAdminCredentials);
    }
}

