package com.tnsif.Exceptionhandling;

public class Fianllydemo2 {
public static void main(String[] args) {
	try {
		System.out.println(16/2);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	finally {
		System.out.println("Welcome to java");
	}
}

}
