package com.evergent.CoreJava.oops;

public class UserLogin {
	public void loginData() {
		System.out.println("Login Info");
	}
	public void loginData(String username, String pass) {
		System.out.println("UserName: "+ username );
		System.out.println("Password: "+ pass );
	}
	public void loginData(String username,String pass, String address) {
		System.out.println("UserName: "+ username );
		System.out.println("Password: "+ pass );
		System.out.println("Address: "+address);
		
		
	}
	public static void main(String args[]) {
		UserLogin ul=new UserLogin();
		ul.loginData();
		ul.loginData("M Bhanu","1234");
		ul.loginData("M Bhanu","1234","hyd");
		
	}

}
