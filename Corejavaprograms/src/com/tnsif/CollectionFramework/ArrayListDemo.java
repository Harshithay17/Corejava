package com.tnsif.CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	//object creation
	
	ArrayList<String> p = new ArrayList<>();
	//add
	
	p.add("Laptop");
	p.add("Mobile");
	p.add("headphone");
	System.out.println(p);
	
	System.out.println("Product 1 : "+p.get(1));
	
	System.out.println("contain mobile?" +p.contains("mobile"));
	
	//no of  elements
	System.out.println(p.size());
	
	p.remove("Headphone");
	
	System.out.println(p);
	
	
	//for each loop
	for (String i:p) {
		System.out.println(i);
	}
}
}
