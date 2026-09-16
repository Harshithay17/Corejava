package com.tnsif.StreamAPI;

import java.util.Arrays;
import java.util.List;

class Employee{
	private int id;
	private String name;
	private String department;
	private double salary;
	
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
	public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	
}

public class Salarybase {
public static void main(String[] args) {
	List<Employee> e = Arrays.asList(new Employee(101,"harshitha","AI",120000),
			new Employee(103,"gagana","IT",90000),
			new Employee(107,"kavana","Finance",98000),
			new Employee(108,"shashank","AI",2300000),
			new Employee(107,"priya","CIVIL",29000),
			new Employee(105,"anju","AI",28000),
			new Employee(102,"sneha","JAVA",25000));
	
	List<String> r = e.stream().filter(employee->employee.getDepartment().equals("AI"))
			.filter(employee->employee.getSalary()>50000)
			.map(employee->employee.getName())
			.sorted().toList();
	System.out.println(r);
			
			
}
}
