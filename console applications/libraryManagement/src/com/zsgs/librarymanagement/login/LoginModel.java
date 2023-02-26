package com.zsgs.librarymanagement.login;

public class LoginModel {

	private LoginController loginController;

	public LoginModel(LoginController loginController) {
		this.loginController = loginController;
	}

	public void checkCredentials(String userName, String password) {
		// boolean canLogin = false;
		if (userName.equals("admin") && password.equals("ZSGS")) {
			loginController.loginSuccess(userName);
		}
		else if(userName.equals("aadhirai") && password.equals("ZSGS")){
			loginController.loginSuccess(userName);
		}else {
			loginController.loginFailiure("\nInvalid Credentials. Please try again!\n");
		}
	}
}
