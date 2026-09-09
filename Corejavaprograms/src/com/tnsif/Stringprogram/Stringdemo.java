package com.tnsif.Stringprogram;

public class Stringdemo {
public static void main(String[] args) {
	//create string
	String s = " Hello Java Programing";
	//legnth
	
	System.out.println("Length: "+ s.length());
	
	//Uppdercase
	System.out.println("Uppercase of a string: "+s.toUpperCase());
	
	//lowercase
	
	System.out.println("Lowercase of a string: "+s.toLowerCase());
	
	//contain
	System.out.println(s.contains("Hello"));
	
	//Replace
	System.out.println(s.replace("Java", "Python"));
	
	System.out.println(s.startsWith("Java"));
	
	System.out.println(s.endsWith("Programing"));
}

}
