package org.spring.course.cars;

import org.spring.course.interfaces.Car;
import org.springframework.stereotype.Component;

//default component name is equal to lower-case class name
@Component
public class Swift implements Car {

	public String getSpec() {
		return "Suzuki hatchbak";
	}

}
