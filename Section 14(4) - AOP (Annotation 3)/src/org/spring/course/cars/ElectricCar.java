package org.spring.course.cars;

import org.springframework.stereotype.Component;

@Component
public class ElectricCar implements Machine{
	
	public void run() {
		System.out.println("Running");
	}

}
