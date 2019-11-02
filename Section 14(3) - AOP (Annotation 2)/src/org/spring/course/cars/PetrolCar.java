package org.spring.course.cars;

public class PetrolCar {

	public void run() {
		System.out.println("Running Petrol car");
	}

	public void run(int speed) {
		System.out.println("Running at speed = " + speed + " km/h");
	}

	public void run(int speed, int km) {
		System.out.println("Running at speed = " + speed + " km/h for kms = " + km);
	}

	public void run(String msg) {
		System.out.println(msg);
	}

}
