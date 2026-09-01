package com.tnsif.Exceptionhandling;

public class Throwdemo {
static void CheckAge(int age) {
	if (age<18) {
		throw new ArithmeticException("Student is not eligible for vote");
		}
	System.out.println("Student is eligible for vote");
}
public static void main(String[] args) {
	try {
		CheckAge(16);
	}
	catch(ArithmeticException a) {
		System.out.println(a.getMessage());
	}
}
}
