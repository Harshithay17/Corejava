package com.tnsif.Stringprogram;

public class Equaldemo {
public static void main(String[] args) {
	String s1 ="Harshitha";
	String s2 =new String("Harshitha");
	String s3 ="harshitha";
	String s4 ="Shashank";
	
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s1.equals(s4));
	
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.equalsIgnoreCase(s3));
	System.out.println(s1.equalsIgnoreCase(s4));
	
	
}
}
