package com.tnsif.Exceptionhandling;

public class Finallydemo3 {
	public static void main(String[] args) {
		try {
			System.out.println(16/0);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Welcome to java");
		}
	}


}
