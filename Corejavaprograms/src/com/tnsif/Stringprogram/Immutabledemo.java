package com.tnsif.Stringprogram;

public class Immutabledemo {
public static void main(String[] args) {
	String s1 = "Harshitha";
	String s2 = s1;
	String s3 = s2;
	
	System.out.println("Before Modification: ");
	System.out.println("S1: "+s1);
	System.out.println("S2: "+s2);
	System.out.println("S3: "+s3);
	
	s1="Shashank";
	System.out.println("After Modification: ");
	System.out.println("S1: "+s1);
	System.out.println("S2: "+s2);
	System.out.println("S3: "+s3);
	
}
}
