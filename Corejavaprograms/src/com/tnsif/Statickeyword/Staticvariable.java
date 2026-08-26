package com.tnsif.Statickeyword;
//demo for static variable

class Employee{
	int id;
	String name;
	static String company="TNS";
	
	Employee(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	void display() {
		System.out.println(id +" "+name+ " "+company);
		}
}


public class Staticvariable {
public static void main(String[] args) {
	Employee e1 = new Employee(101,"harshitha");
	Employee e2 = new Employee(102,"gagana");
	Employee e3 = new Employee(103,"Shashank");
	Employee e4 = new Employee(104,"Kavana");
	
	e1.display();
	e2.display();
	e3.display();
	e4.display();
	
	
}

}
