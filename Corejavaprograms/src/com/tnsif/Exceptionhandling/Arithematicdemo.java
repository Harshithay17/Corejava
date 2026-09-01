package com.tnsif.Exceptionhandling;

public class Arithematicdemo {
public static void main(String[] args) {
	
	int salary=50000;
	int workingdays=25;
	int bonusdays=5;
	try {
		int dailysalary=salary/workingdays;
		System.out.println("Daily salary: "+ dailysalary);
		
		int bonusperday=salary/0;
		System.out.println("Bonus Per Day is "+ bonusperday);
		
	}
	catch(Exception a) {
		System.out.println("cannot calculate the bonus per day");
		System.out.println(a);
	}
	System.out.println("Salary calculation process completed");
}

}
