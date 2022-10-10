package com.in28minutes;
import java.util.HashMap;

public class UserValidationService {
	
	//<String name,String password>
	private HashMap<String, String> users;
	
	public UserValidationService() {
		this.users = new HashMap<String, String>();
		users.put("Quentin", "test");
		users.put("Tristan", "test");
	}

	public boolean isUserValid(String user, String password) {
		if(users.containsKey(user) && users.get(user).equals(password)) {
			return true;
		} else {
			return false;
		}
	}
}
