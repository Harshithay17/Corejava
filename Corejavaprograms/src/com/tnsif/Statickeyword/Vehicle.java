package com.tnsif.Statickeyword;

class Vehicle1 {
	void start() {
		System.out.println("Vehicle is sttarting");
		
	}

}
class Car extends Vehicle1{
	@Override
	void start() {
		System.out.println("Car starts with a key");
		
	}
	
}
class Bike extends Vehicle1{
	@Override
	void start() {
		System.out.println("Bike starts with a self-start");
		
	}
	
}
public class Vehicle{
public static void main(String[] args) {
	Vehicle1 v;
	v=new Car();
	v.start();
	System.out.println();
	v=new Bike();
	v.start();
}
	
}