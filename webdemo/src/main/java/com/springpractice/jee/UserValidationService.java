package com.springpractice.jee;

public class UserValidationService {
	public boolean isUserValid(String user, String password) {
		if(user.equals("myname")&&password.equals("dummy"))
			return true;
		return false;
	}
}
