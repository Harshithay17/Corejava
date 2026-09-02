package com.tnsif.Multithreadprograms;
//demo for multithreading

class Eclipse extends Thread{
	public void run() {
		System.out.println("Eclipse"+ " " +Thread.currentThread().getId());
	}
}

class onenote extends Thread{
	public void run() {
		System.out.println("Onenote"+" " +Thread.currentThread().getId());
	}
}

class Chrome extends Thread{
	public void run() {
		System.out.println("Chrome"+" " +Thread.currentThread().getId());
	}
}
public class Extendingthread {
public static void main(String[] args) {
	Eclipse e = new Eclipse();
	e.start();
	
	onenote o = new onenote();
	o.start();
	
	Chrome c = new Chrome();
	c.start();
	for (int i=0;i<=5;i++) {
		System.out.println("Main method thread id" +" " +Thread.currentThread().getId());
		
	}
}
}
