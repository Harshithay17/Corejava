package com.tnsif.Superpragrams;
class Employee{
	void calculatePerformance() {
		System.out.println("Calculating employee performance");
	}
}

class Senioremployee extends Employee {
	void  calculatePerformance() {
		super.calculatePerformance();
		System.out.println("calculating leaderdship performance");
	}
	
}






public class Supermethod {
	public static void main(String[] args) {
		Senioremployee s1 = new Senioremployee();
		s1.calculatePerformance();
	}

}
