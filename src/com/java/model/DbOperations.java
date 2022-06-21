package com.java.model;

import com.java.beans.LoginBean;

public class DbOperations {

	public boolean saveUser(LoginBean user){
		
		// code related to insert record in to the db
		
		System.out.println("user bean saved successfully");
		return true;
	}
	
	public void updateUser(LoginBean user){
		//  code to update the user
		
	}
	
	
	
}
