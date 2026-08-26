package com.tnsif.Polymorphism;

//demo for method overriding
class BankAccount{
	void calculateIntrest(double amount) {
		System.out.println("Calculating standard bank intrest");
		System.out.println("Amount"+ amount);
	}
}

class SavingAccount extends BankAccount{
	@Override
	void calculateIntrest(double amount) {
		double intrest = amount*0.04;
		System.out.println("Saving account");
		System.out.println("Principal :"+ amount);
		System.out.println("Intrest:"+intrest);
		
		
	}
	
	
}
class FixedDeposit extends BankAccount{
	@Override
	void calculateIntrest(double amount) {
		double intrest = amount*0.07;
		System.out.println("Fixed deposit");
		System.out.println("Principal :"+ amount);
		System.out.println("Intrest:"+intrest);
		
		
	}
	
	
}
class CurrentAccount extends BankAccount{
	@Override
	void calculateIntrest(double amount) {
	System.out.println("Current account");
	System.out.println("no intrest provided");
	}
	}

public class MethodOverriding {
public static void main(String[] args) {
	BankAccount a;
	a=new SavingAccount();
	a.calculateIntrest(100000);
	System.out.println();
	
	a=new FixedDeposit();
	a.calculateIntrest(100000);
	
	System.out.println();
	
	a=new CurrentAccount();
	a.calculateIntrest(1000000);
	
	
	
	
}

}
