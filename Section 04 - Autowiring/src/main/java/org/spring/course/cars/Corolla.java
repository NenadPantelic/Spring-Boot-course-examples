package org.spring.course.cars;

import org.spring.course.interfaces.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Corolla implements Car {

	@Autowired
	private Engine _engine;
	
	public Engine getEngine() {
		return _engine;
	}

	@Autowired
	public void setEngine(Engine engine) {
		//engine.setType("New V8 engine");
		_engine = engine;
	}

	public String getSpec() {
		return "Sedan by Toyota with engine type as " + getEngine().getType();
	}

}
