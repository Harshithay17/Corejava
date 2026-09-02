package com.tnsif.Multithreadprograms;

class Account {
	int balance = 20000;
	synchronized void deposit(int amount) {
		System.out.println(Thread.currentThread().getName()+ " is depositing "+amount);
		
		int currentBalance= balance;
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			System.out.println(e);
		}
		balance = currentBalance+amount;
		System.out.println(Thread.currentThread().getName()+" Completed balance ="+ balance);
	}
}

class DepositeTask implements Runnable{
	Account account;
	

	 DepositeTask(Account account) {
	
		this.account = account;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		account.deposit(500);
		
	}
	
}
public class Sychronizationdemo {
public static void main(String[] args) {
	Account account = new Account();
	DepositeTask t= new DepositeTask(account);
	
	Thread t1=new Thread(t,"Thread-1");
	Thread t2=new Thread(t,"Thread-2");
	
	t1.start();
	t2.start();
	
}

}
