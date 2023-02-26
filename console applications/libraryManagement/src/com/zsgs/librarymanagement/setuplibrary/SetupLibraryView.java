package com.zsgs.librarymanagement.setuplibrary;

import java.util.Scanner;
import com.zsgs.librarymanagement.login.LoginView;

public class SetupLibraryView {

    private SetupLibraryController setupLibraryController;
    private LoginView loginView;
    private Scanner scanner = new Scanner(System.in);
    
    public SetupLibraryView(){
        setupLibraryController  = new SetupLibraryController(this);
        loginView  = new LoginView();
    }

    static public void main(String[] args) {
		SetupLibraryView setupLibraryView = new SetupLibraryView();
		setupLibraryView.viewLibraryDetails();
	}

    public void viewLibraryDetails(){
        System.out.println("Welcome to Library Management System\n ------------------------");
		System.out.println("Enter Library Name");
		String libraryName = scanner.next();
		System.out.println("Enter Location");
		String location = scanner.next();
		setupLibraryController.setLibraryInfo(libraryName, location);
    }

    public void librarySetupSuccess(String libraryName , String location){
        System.out.println("Welcome to " + libraryName + " - " + location + " library management system\n ------------------------");
        loginView.checkForLogin();
    }
}
