package org.spring.course.config;

import org.spring.course.aspects.Diagnose;
import org.spring.course.cars.ElectricCar;
import org.spring.course.cars.PetrolCar;
import org.spring.course.service.CarService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Config {

	@Bean("electricCar")
	public ElectricCar electricCar() {
		return new ElectricCar();
	}

	@Bean("petrolCar")
	public PetrolCar petrolCar() {
		return new PetrolCar();
	}

	@Bean("carService")
	public CarService carService() {
		return new CarService();
	}

	@Bean("diagnose")
	public Diagnose diagnose() {
		return new Diagnose();
	}

}
