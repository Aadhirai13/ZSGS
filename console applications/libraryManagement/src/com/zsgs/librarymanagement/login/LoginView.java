package com.zsgs.librarymanagement.login;

import com.zsgs.librarymanagement.managebooks.ManageBooksView;
import java.util.Scanner;

// import com.zsgs.librarymanagement.LibManagementBasic;

public class LoginView {

	private LoginController loginController;
	private ManageBooksView manageBooksView;
	private Scanner scanner = new Scanner(System.in);

	public LoginView() {
		loginController = new LoginController(this);
		manageBooksView = new ManageBooksView();
	}

	public void checkForLogin() {
//		System.out.println("Welcome to Library Management System\n ------------------------");
		System.out.println("Enter User Name");
		String userName = scanner.next();
		System.out.println("Enter password");
		String password = scanner.next();
		loginController.checkCredentialsOnline(userName, password);
	}

	public void loginSuccess(String userName) {
		System.out.println("\n--> Welcome " + userName + " <--\n");
		System.out.println("Thanks for Login.\n ------------------------");
		manageBooksView.showManageBooksView();
	}

	public void loginFailed(String errorMessage) {
		System.out.println(errorMessage);
		checkForLogin();
	}
}
