package org.spring.course.service;

import org.spring.course.cars.ElectricCar;
import org.spring.course.cars.PetrolCar;
import org.springframework.beans.factory.annotation.Autowired;

public class CarService {
	@Autowired
	private ElectricCar _electricCar;
	@Autowired
	private PetrolCar _petrolCar;

	public ElectricCar getElectricCar() {
		return _electricCar;
	}

	public void setElectricCar(ElectricCar electricCar) {
		_electricCar = electricCar;
	}
	
	public PetrolCar getPetrolCar() {
		return _petrolCar;
	}

	public void setPetrolCar(PetrolCar petrolCar) {
		_petrolCar = petrolCar;
	}

}
