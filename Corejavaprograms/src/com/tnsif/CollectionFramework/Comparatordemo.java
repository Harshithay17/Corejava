package com.tnsif.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//demo for Comparator Interface

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	void display(){
		System.out.println("Name : "+ name + "Age: "+age);
		}
}

//sort by name
class NameComparator implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
}

//sort by Age
class AgeComparator implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.age,o2.age);
	}
}

	
public class Comparatordemo {
public static void main(String[] args) {
	List<Person> p =new ArrayList<>();
	p.add(new Person("John",30));
	p.add(new Person("Rohan",40));
	p.add(new Person("Guru",55));
	p.add(new Person("Tulsi",76));
	
	//sort by name
	
	Collections.sort(p,new NameComparator());
	System.out.println("Sorted by name");
	for (Person s:p) {
		s.display();
		
	}
	
	//sort by age
	Collections.sort(p,new AgeComparator());
	System.out.println("Sorted by Age");
	for (Person s:p) {
		s.display();
}
}
}


