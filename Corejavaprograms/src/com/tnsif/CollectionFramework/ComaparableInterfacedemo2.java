package com.tnsif.CollectionFramework;
import java.util.ArrayList;
import java.util.Collections;

class Student1 implements Comparable<Student1>{
	int marks;
	String Name;
	
	
	public Student1(int marks, String name) {
		
		this.marks = marks;
		Name = name;
	}

	@Override //for string
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		return this.Name.compareTo(o.Name);
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", Name=" + Name + "]";
	}
	
}


public class ComaparableInterfacedemo2 {
public static void main(String[] args) {
	ArrayList<Student> s1 = new ArrayList<>();
	s1.add(new Student(85,"Harshi"));
	s1.add(new Student(93,"Gagana"));
	s1.add(new Student(89,"Shashank"));
	s1.add(new Student(54,"Kavana"));
	
	Collections.sort(s1);
	System.out.println(s1);
	
}

}

