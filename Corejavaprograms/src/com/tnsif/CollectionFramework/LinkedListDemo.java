package com.tnsif.CollectionFramework;

import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String> h = new LinkedList<>();
	
	h.add("google");
	h.add("youtube");
	h.add("github");
	h.add("python");
	h.add("java");
	
	System.out.println(h);
	
	h.addFirst("SQL");
	
	h.addLast("PostgresSQL");
	
	System.out.println(h);
	
	//VIEW first without removing
	
	System.out.println("First "+h.peekFirst());
	
	//remove first
	System.out.println("Removed "+h.pollFirst());
	System.out.println(h);
}

}
