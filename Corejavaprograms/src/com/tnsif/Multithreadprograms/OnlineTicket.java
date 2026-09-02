package com.tnsif.Multithreadprograms;

class TicketCounter{
	int ticket=5;
	synchronized void Bookticket(int number) {
	if(ticket>=number) {
		System.out.println(Thread.currentThread().getName()+" is booking ="+ number+"tickets");
	
	int available=ticket;
	try {
		Thread.sleep(3000);
	}
	catch(InterruptedException e) {
		System.out.println(e);
		
	}
	ticket=available-ticket;
	System.out.println(Thread.currentThread().getName()+" Booking completed ");
}
	else {
		System.out.println(Thread.currentThread().getName()+" Not enough tickets ");
	}
		
	}


	}
class Bookingticket implements Runnable{
	TicketCounter t;
	

	
	 Bookingticket(TicketCounter t) {
		
		this.t = t;
	}

	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.Bookticket(4);
		
	}
	
}

public class OnlineTicket {
public static void main(String[] args) {
	TicketCounter t = new TicketCounter();
	Bookingticket b = new Bookingticket(t);
	
	Thread t1=new Thread(b,"customer-01");
	Thread t2=new Thread(b,"customer-02");
	Thread t3=new Thread(b,"customer-03");
	
	t1.start();
	t2.start();
	t3.start();
	
	
}

}
