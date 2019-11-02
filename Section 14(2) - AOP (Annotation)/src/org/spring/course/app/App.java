package org.spring.course.app;

import org.spring.course.config.Config;
import org.spring.course.service.CarService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		CarService service = context.getBean("carService", CarService.class);
		// without poincut
		service.getElectricCar().run();
		// with pointcut
		try {
			service.getPetrolCar().run();
			//throw new Exception("Testing");
		} catch (Exception e) {
			System.out.println("Caught exception - " + e.getMessage());

		}

		// context.close();

	}

}
