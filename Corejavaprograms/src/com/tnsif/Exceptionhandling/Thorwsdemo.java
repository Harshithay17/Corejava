package com.tnsif.Exceptionhandling;

public class Thorwsdemo {
static void calculate(int a, int b) throws ArithmeticException{
	int result = a/b;
	System.out.println("Result "+ result);
}
public static void main(String[] args) {
	try {
		calculate(29,0);
	}
	catch(ArithmeticException e) {
		System.out.println("Cannot devided by zero");
	}
}
}
