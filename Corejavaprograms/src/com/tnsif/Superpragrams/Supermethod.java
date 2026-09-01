package com.tnsif.Superpragrams;
class Developer{
	void calculatePerformance() {
		System.out.println("Calculating employee performance");
	}
}

class SeniorEmploye extends Developer {
	void  calculatePerformance() {
		super.calculatePerformance();
		System.out.println("calculating leaderdship performance");
	}
	
}






public class Supermethod {
	public static void main(String[] args) {
		SeniorEmploye s1 = new SeniorEmploye();
		s1.calculatePerformance();
	}

}
