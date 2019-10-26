package org.spring.course;

import org.spring.course.cars.Corolla;
import org.spring.course.cars.Swift;
import org.spring.course.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car myCar = context.getBean("corolla", Car.class);

		System.out.println(myCar.getSpec());
	}

}
