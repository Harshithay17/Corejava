package com.tnsif.Exceptionhandling;

public class WithException {public static void main(String[] args) {
	System.out.println("Good morning all");
	int a=90;
	int b = 0;
	System.out.println("welcome to java");
	try {
	System.out.println(a/b);
	}
	catch(Exception r){
		System.out.println(r);// r is an object which stores the exception information
		
	}
	System.out.println("hello world");
	
}


}
