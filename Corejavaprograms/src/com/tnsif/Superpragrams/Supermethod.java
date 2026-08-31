package com.tnsif.Superpragrams;
class Supermethod1{
	void calculatePerformance() {
		System.out.println("Calculating employee performance");
	}
}

class SeniorEmploye extends Employee {
	void  calculatePerformance() {
		super.calculatePerformance();
		System.out.println("calculating leaderdship performance");
	}
	
}






public class Supermethod {
	public static void main(String[] args) {
		Senioremploye s1 = new Senioremploye();
		s1.calculatePerformance();
	}

}
