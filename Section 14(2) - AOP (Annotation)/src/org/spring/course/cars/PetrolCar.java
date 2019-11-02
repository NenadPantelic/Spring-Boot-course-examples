package org.spring.course.cars;

public class PetrolCar {

	public void run() throws Exception {
		System.out.println("Running");
		throw new Exception("Test exception");
	}

}
