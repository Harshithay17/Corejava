package com.tnsif.Interface;

// DEMO FOR e -COMMERense order processing

interface OrderService{
	boolean validateorder(double amount);
	void ProcessPayment(double amount);
	void generateInvoice(String orderId, double amount);
	void UpdateOrderstatus(String orderId,String status);
}

class OnlineOrder implements OrderService{
	private String customername;
	private String Orderid;
	

	public OnlineOrder(String customername, String orderid) {
		super();
		this.customername = customername;
		Orderid = orderid;
	}

	@Override
	public boolean validateorder(double amount) {
		// TODO Auto-generated method stub
		if (amount>0) {
			System.out.println("Order validation successfull");
		
		return true;
	}
		System.out.println("Invalid order amount");
		return false;
	}
	@Override
	public void ProcessPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("procesing payment"+amount);
		System.out.println("payment successsfull");
		
	}

	@Override
	public void generateInvoice(String orderId, double amount) {
		// TODO Auto-generated method stub
		System.out.println("invoice generated");
		System.out.println("orderid"+orderId);
		System.out.println("customer name"+customername);
		System.out.println("Amount"+amount);
		
	}
	@Override
	public void UpdateOrderstatus(String orderId,String status) {
		System.out.println("order"+orderId+"status updated to:" +status);
	}
	
}

public class Mainmethod {
public static void main(String[] args) {
	OnlineOrder o= new OnlineOrder("Ruth","ORD1001");
	double amount =2444;
	if(o.validateorder(amount)) {
		o.ProcessPayment(amount);
		o.generateInvoice("ORD1001", amount);
		o.UpdateOrderstatus("ORD1001","Conformed");
	}
	}

}
