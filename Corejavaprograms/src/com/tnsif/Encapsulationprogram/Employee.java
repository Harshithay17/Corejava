package com.tnsif.Encapsulationprogram;

import java.util.Scanner;

class Employe{
	
	private	int id;
	private	String name;
	private	String department;
	private	double salary;

	// parameterised constrains
		Employe(int id, String name, String department, double salary){
			this.id=id;
			this.name=name;
			this.department=department;
			this.salary=salary;
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		public void increaseSalary(double percentage) {
			
		
			salary = salary+ (salary*percentage/100);
	}
		//Display employee ditails
		public void displayEmployeeDetails() {
			System.out.println("Employee ID: "+ id);
			System.out.println("Employee Name: "+ name);
			System.out.println("Employee department: "+ department);
			System.out.println("Employee salary: "+ salary);
			System.out.println();
			
		}
}
public class Employee{
	public static void main(String[] args) {
		//creating object using constructor
		Employe emp1 = new Employe(101,"Harshi","IT",45000);
		Employe emp2 = new Employe(102,"Ramya","IT",50000);
		System.out.println("Employee details:");
		System.out.println();
		emp1.displayEmployeeDetails();
		emp2.displayEmployeeDetails();
		
		// increasing harshitha's salary by 10%
		emp1.increaseSalary(10);
		
		System.out.println("After Salary increase:");
		System.out.println();
		emp1.displayEmployeeDetails();
		emp2.displayEmployeeDetails();
		
}
}
	









