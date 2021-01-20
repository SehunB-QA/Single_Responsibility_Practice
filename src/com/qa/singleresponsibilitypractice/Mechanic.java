package com.qa.singleresponsibilitypractice;

public class Mechanic {
	
	int carMileageNumberForRepair = 20000;
	public void repair(Car car)
	{
	if(car.getMileage() >= carMileageNumberForRepair)	
	{
	System.out.println("Your car is beat up!");
	
		 car.setMileage(0);
		 System.out.println("Your car is now running like new!");
		 
	}

	}
	
}
