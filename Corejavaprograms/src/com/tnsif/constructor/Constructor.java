package com.tnsif.constructor;

class Employee {
	String name;
	int salary;
	
	// default constructor
	Employee() {
		name = "Harshitha";
		salary=45000;
		
	}
	void display() {
		System.out.println("Name " + name);
		System.out.println("Salary " + salary);
		
	}
}
public class Constructor {
public static void main(String[] args) {
	Employee e =  new  Employee();
	e.display();
	}
	

}
