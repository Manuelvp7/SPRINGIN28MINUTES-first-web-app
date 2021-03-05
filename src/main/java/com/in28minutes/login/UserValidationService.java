package com.in28minutes.login;

import org.springframework.stereotype.Service;

@Service
public class UserValidationService {
	
	public boolean isUserValid(String user, String password) {
		return user.equals("JUAN MANUEL") && password.equals("password"); 
	}

}
