package org.spring.course.cars;

public class PetrolCar implements Machine {

	@Deprecated
	public void run() {
		System.out.println("Running");
	}
	
	
	public void recharge(Battery battery) {
		System.out.println("Car recharged");
	}

}
