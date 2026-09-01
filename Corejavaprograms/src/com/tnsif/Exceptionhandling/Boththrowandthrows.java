package com.tnsif.Exceptionhandling;

public class Boththrowandthrows {
static void Login(String username,String password) throws Exception{
	if (username.equals("admin")) {
		throw new Exception("Invalid username");
	}
	if(!password.equals("1234")) {
		throw new Exception("Invalid password");
		
	}
	System.out.println("Login Successfully");
}
public static void main(String[] args) {
	try {
		Login("Harshi","1234");
	}
	catch(Exception s) {
		System.out.println(s.getMessage());
		
	}
	System.out.println("Login Process Completed");
}

}
