package com.tnsif.Inheritance;
// demo for inheritance(single level)

class Father{
	int money=50000;
	String car="BMW";
	void read() {
		System.out.println("Reading a news paper");//method
	}
}

class son extends Father{//child class
	String cycle = "blue";
	
	void play() {
		System.out.println("Playing cricket");
	}
}
public class Singlelevelinheritance {
	public static void main(String[] args) {
		son s = new son();
		System.out.println(s.money);//p
		System.out.println(s.car);//p
		System.out.println(s.cycle);//p
		
		
		s.read();
		s.play();
		
	}

}
