package com.tnsif.CollectionFramework;

import java.util.Vector;

public class Vectordemo {
public static void main(String[] args) {
	Vector<Integer> v = new Vector<>();
	
	v.add(1);
	v.add(2);
	v.add(50);
	v.add(67);
	v.add(43);
	v.add(100);
	v.add(43);
	
	System.out.println(v);
	
	v.addElement(53);
	
	System.out.println(v);
	
	v.addFirst(4);
	System.out.println(v);
	
	v.capacity();
	System.out.println(v);
	
	v.clone();
	System.out.println(v);
	
	v.getClass();
	System.out.println(v);
	
	v.remove(5);
	System.out.println(v);
	
	v.clear();
	System.out.println(v);
	
	for(Integer h:v) {
		System.out.println(h);
	}
	
}

}
