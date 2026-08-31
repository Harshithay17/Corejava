package com.tnsif.Interface;

interface GPS{
	void trackLocation();
	void calculateRoute();
	
}

interface VehicleSafety{
	void detectCollision();
	void applyEmergencyBreak();
	
}
 class SmartVehicle implements GPS,VehicleSafety{
	 int vehicleNumber;
	 double speed;
	 String location;
	 
	 

	


	public SmartVehicle(int vehicleNumber, double speed, String location) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.speed = speed;
		this.location = location;
	}



	@Override
	public void trackLocation() {
		// TODO Auto-generated method stub
		System.out.println("Current Location");
		
	}



	@Override
	public void calculateRoute() {
		// TODO Auto-generated method stub
		System.out.println("Route: Bangalore->Mysore");
		
	}

	@Override
	public void detectCollision() {
		boolean collision = true;
		if (collision) {
			System.out.println("Emergency Breake Applied!");
			applyEmergencyBreak();
		}
		else {
			System.out.println("No collision detected");
			}
	
		
		
		}
	


	@Override
	public void applyEmergencyBreak() {
		// TODO Auto-generated method stub
		System.out.println("Emergency Breake Applied");
		
		
		
	}
	public void checkSpeed() {
		int speedLimit = 80;
		if (speed>speedLimit) {
			System.out.println("Speed is Limit Exceeded!");
			
			
		}
		else {
			System.out.println("Speed is within the limit.");
		}
	}
	public void displayStatus() {
		
			System.out.println("\n Vehivle Number : "+ vehicleNumber);
			System.out.println("\n current speed : "+ speed+"km/h");
			trackLocation();
			calculateRoute();
			checkSpeed();
			detectCollision();
			
			
			
		}
		
	}
	 
 
public class FuctionalInterface {
public static void main(String[] args) {
	SmartVehicle vehicle = new SmartVehicle(101,90,"Begalore");
	vehicle.displayStatus();
	
}

}
 
