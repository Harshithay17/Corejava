package com.tnsif.Exceptionhandling;

public class Nullpointerdemo {
public static void main(String[] args) {
	String employeename ="harshitha";
	String department = null;
	String designation="developer";
	try {
		System.out.println("Emplkoyee name "+employeename);
		System.out.println("Emplkoye Designation "+ designation );
		System.out.println("Emplkoyee Department"+department.toLowerCase());
		
		
		
	}
	catch(NullPointerException N) {
		System.out.println("Employee department is missing ");
		System.out.println(N);
		 
	}
	System.out.println(" employee data analysis completed");
}

}
