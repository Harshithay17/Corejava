package com.tnsif.StreamAPI;

import java.util.Arrays;
import java.util.List;

class Customer{
	private String name;
	private String city;
	
	public Customer(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}


public class CustomerManagement {
public static void main(String[] args) {
	List<Customer> c = Arrays.asList(new Customer("harshitha","Tumkur"),
			new Customer("Gagana","Bangalore"),
			new Customer("kavana","Tumkur"),
			new Customer("shashank","Tumkur"),
			new Customer("prarthana","Dubai"),
			new Customer("priya","Mumbai"),
			new Customer("reena","Bengalore"));
	c.stream().filter(c1->c1.getCity().equals("Tumkur")).forEach(c1->System.out.println(c1.getName()+" " + c1.getCity()));
	
}
}
