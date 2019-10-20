package org.spring.course.cars;

import org.spring.course.interfaces.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("corolla")
public class Corolla implements Car {

	//use Qualifier("<beanName">) to solve ambiguity between bean names when autowiring - default bean name is
	// the type (class) name in lower case
	@Autowired
	private Engine _engine;

	@Autowired
	public Corolla(Engine engine) {
		//engine.setType("New V8");
		_engine = engine;
	}

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
