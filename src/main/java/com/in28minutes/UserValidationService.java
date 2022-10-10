package com.in28minutes;

public class UserValidationService {

	public boolean isUserValid(String user, String password) {
		if(user.equals("Quentin") && password.equals("test")) {
			return true;
		} else {
			return false;
		}
	}
}
