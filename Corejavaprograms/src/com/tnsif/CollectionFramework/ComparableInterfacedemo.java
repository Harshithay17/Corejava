package com.tnsif.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	int marks;
	String Name;
	
	//constructor
	public Student(int marks, String name) {
		
		this.marks = marks;
		this.Name = name;
	}

	@Override //integer
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.marks-o.marks; //this is assending order if we what desending order o.marks-this.marks
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", Name=" + Name + "]";
	}
	
}


public class ComparableInterfacedemo {
public static void main(String[] args) {
	ArrayList<Student> s = new ArrayList<>();
	s.add(new Student(85,"harshi"));
	s.add(new Student(43,"gagana"));
	s.add(new Student(89,"Shashank"));
	s.add(new Student(34,"Kavana"));
	
	Collections.sort(s);
	System.out.println(s);
	
}

}
