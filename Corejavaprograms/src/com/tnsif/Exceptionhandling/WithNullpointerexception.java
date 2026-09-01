package com.tnsif.Exceptionhandling;

public class WithNullpointerexception {
public static void main(String[] args) {
	String str = null;
	try {
		
	
	System.out.println(str.length());
	}
	catch(NullPointerException n) {
		System.out.println(n);
		
	}
	
	System.out.println("program continue");
	}

	
}
