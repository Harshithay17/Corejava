package com.tnsif.Exceptionhandling;

public class ArrayIndex {
public static void main(String[] args) {
	int marks[]= {80,70,50,54};
	try {
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[7]);
	}
	catch(Exception m) {
		System.out.println(m);
		
	}
	System.out.println(marks[0]);
}

}
