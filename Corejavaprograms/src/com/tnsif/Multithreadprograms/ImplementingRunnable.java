package com.tnsif.Multithreadprograms;

class Whatsapp implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<5;i++) {
			System.out.println("whatsapp id "+" "+Thread.currentThread().getId());
		}
		
	}
	
	
}
public class ImplementingRunnable {
public static void main(String[] args) {
	Whatsapp w = new Whatsapp();
	Thread obj=new Thread(w);
	obj.start();
	System.out.println("Main Id"+" " + Thread.currentThread().getId());
	
	
}

}
