package com.tnsif.Exceptionhandling;

public class Finallydemo1 {
public static void main(String[] args) {
	try {
		System.out.println(16/0);
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	
		
	}
	finally {
		System.out.println("Welcome to java");
	}
}

}
