package com.tnsif.Statickeyword;

class Calculator {
	//circle
	double calculateArea(double radius) {
		return 3.14*radius*radius;
	}
	//rectangle
	double calcualateArea(double length, double breadth) {
		return length*breadth;
	}
	//Square
	int calculateArea(int side) {
		return side *side;
		
	}
public static void main(String[] args) {
	Calculator c = new Calculator();
	System.out.println("Circle Area:"+c.calculateArea(5.0));
	System.out.println("Recatangle:"+c.calcualateArea(10.0,5.0));
	System.out.println("Square:"+c.calculateArea(4));
}
}

