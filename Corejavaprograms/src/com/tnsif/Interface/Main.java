package com.tnsif.Interface;

interface payments{
	void pay(double amount);
	void checkSatus();
	
}

class UPI implements payments{




@Override
public void pay(double amount) {
	// TODO Auto-generated method stub
	System.out.println("Paid"+amount+"Using UPI");
	
}

@Override
public void checkSatus() {
	// TODO Auto-generated method stub
	System.out.println("UPI Payment successfully");
	
}
}

public class Main {
public static void main(String[] args) {
	UPI u= new UPI();
	u.pay(1500.90);
	u.checkSatus();
}

}
