package com.tnsif.Abstractionprogram;

abstract class Notification{
	abstract void SendMessage(String message );
	
}
class EmailNotification extends Notification{

	@Override
	void SendMessage(String message) {
		// TODO Auto-generated method stub
		String email= "harshithay93@gmail.com";
		System.out.println("Sending email....");
		System.out.println("To"+email);
		System.out.println("Meassge"+message);
		int meassagelength = message.length();
		System.out.println("meassage Length: "+meassagelength);
		
	}
	
	
}


public class NotificationDemo {
public static void main(String[] args) {
	 EmailNotification e = new EmailNotification();
	 e.SendMessage("Your Project is approved");
}

}
