package com.tnsif.Exceptionhandling;

public class Throwdemo2 {
static void Checkpassword(String password) {
	if (password.length()<6) {
		throw new IllegalArgumentException("Password is too short");
		
	}
	System.out.println("password accepted");
}
public static void main(String[] args) {
	try {
		Checkpassword("harshi");
	}
	catch(IllegalArgumentException i) {
		System.out.println(i.getMessage());
	}
	
}
public Throwdemo2() {
	// TODO Auto-generated constructor stub
}
}
