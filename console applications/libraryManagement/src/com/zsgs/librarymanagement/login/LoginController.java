package com.zsgs.librarymanagement.login;

public class LoginController {

	private LoginView loginView;
	private LoginModel loginModel;

	public LoginController(LoginView loginView) {
		this.loginView = loginView;
		this.loginModel = new LoginModel(this);
	}
	
	public boolean checkCredentials(String userName, String password) {
		// boolean canLogin = false;
		if (userName.equals("admin") && password.equals("ZSGS")) {
			return true;
		} else if (userName.equals("aadhirai") && password.equals("ZSGS")) {
			return true;
		}
		return false;
	}

	public void checkCredentialsOnline(String userName, String password) {
		loginModel.checkCredentials(userName,password);
	}

	public void loginSuccess(String userName) {
		loginView.loginSuccess(userName);
	}

	public void loginFailiure(String errorMessage) {
		loginView.loginFailed(errorMessage);
	}
	
}
