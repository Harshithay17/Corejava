package com.tnsif.Superpragrams;
class person{
	String name;

	
		person(String name){
		this.name = name;
		System.out.println("person constructor");
	}
	
	
	
}
class Student extends person{
	int rollno;
	Student(String name,int rollno){
		
		super(name);
		this.rollno = rollno;
		System.out.println("Student constructor");
	}
	
}


public class SuperConstuctor {
public static void main(String[] args) {
	Student s =new Student("Rahul",101);
	System.out.println(s.name);
	System.out.println(s.rollno);
}

}
