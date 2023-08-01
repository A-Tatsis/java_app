package com.alex.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authedicate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("alex");
		boolean isValidPassword = password.equalsIgnoreCase("pass");
		
		return isValidUserName && isValidPassword;
	}

}
