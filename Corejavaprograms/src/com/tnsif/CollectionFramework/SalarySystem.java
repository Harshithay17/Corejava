package com.tnsif.CollectionFramework;

import java.util.TreeSet;

public class SalarySystem {
public static void main(String[] args) {
	TreeSet <Integer> t = new TreeSet<>();
	
		t.add(35000);
		t.add(20000);
		t.add(30000);
		t.add(35000);
		t.add(45000);
		t.add(42000);
		t.add(56000);
		t.add(89000);
		t.add(90000);
		t.add(75000);
		System.out.println("Salaries : "+ t);
		System.out.println("Total Salaries: "+ t.size());
		
		System.out.println("Contains 30000 : "+ t.contains(30000));
		//below
		System.out.println( t.headSet(30000));
		
		//high
		System.out.println( t.tailSet(30000));
		
		//between
		System.out.println( t.subSet(10000, 30000));
		
		
		
	}

}
