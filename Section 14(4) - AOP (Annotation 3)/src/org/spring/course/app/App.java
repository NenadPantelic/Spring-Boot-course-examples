package org.spring.course.app;

import org.spring.course.cars.Battery;
import org.spring.course.config.Config;
import org.spring.course.service.CarService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		CarService service = context.getBean("carService", CarService.class);
		service.getElectricCar().run();
		service.getPetrolCar().run();

		service.getPetrolCar().recharge(new Battery());
		context.close();

	}

}
