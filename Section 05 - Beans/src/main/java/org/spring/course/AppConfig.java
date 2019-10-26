package org.spring.course;

import org.spring.course.cars.Corolla;
import org.spring.course.cars.Engine;
import org.spring.course.cars.Swift;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.spring.course")
public class AppConfig {

	@Bean("myCorolla")
	public Corolla corolla() {
		return new Corolla();
	}

	@Bean
	public Swift swift() {
		return new Swift();
	}
	
	@Bean
	public Engine engine() {
		return new Engine();
	}

}
