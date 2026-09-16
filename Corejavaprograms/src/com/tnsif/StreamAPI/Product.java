package com.tnsif.StreamAPI;

import java.util.Arrays;
import java.util.List;

class Product1{
	private String name;
	private double price;
	
	public Product1(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}

public class Product {
public static void main(String[] args) {
	List<Product1> p = Arrays.asList(new Product1("Laptop",50000),
			new Product1("phone",15000),
			new Product1("Charger",3000),
			new Product1("SmartWatch",4000),
			new Product1("PowerBank",8000),
			new Product1("macbook",150000));
	
	List<String> r = p .stream().filter(p1->p1.getPrice()<5000).map(p1->p1.getName()).sorted().toList();
	System.out.println(r);
			
	
}

}
