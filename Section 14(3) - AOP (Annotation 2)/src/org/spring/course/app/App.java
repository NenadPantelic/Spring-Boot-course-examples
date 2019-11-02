package org.spring.course.app;

import org.spring.course.config.Config;
import org.spring.course.service.CarService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		CarService service = context.getBean("carService", CarService.class);
		// with pointcut
		service.getPetrolCar().run();
		service.getPetrolCar().run(100);
		service.getPetrolCar().run(100,20);
		service.getPetrolCar().run("Test");

		service.getElectricCar().run();

		context.close();

	}

}
