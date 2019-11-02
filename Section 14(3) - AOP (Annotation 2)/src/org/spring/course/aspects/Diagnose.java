package org.spring.course.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Diagnose {

	// * wildcard replaces one parameter, return type, class name ,method name
	// .. wildcard replaces any number of params
	// from any class inside cars package for run method with any form of param list
	@Pointcut("execution(void org.spring.course.cars.*.run(..))")
	public void exec() {
	}

	// every return type, any form of run method with exactly one param
	@Pointcut("execution(* org.spring.course.cars.PetrolCar.run(*))")
	public void exec2() {
	}

	// any return type, any method inside cars package with any form of param list
	@Pointcut("execution(* org.spring.course.cars.*.*(..))")
	public void exec3() {
	}

	// any return type, any private method inside cars package with any form of
	// param list
	@Pointcut("execution(private * org.spring.course.cars.*.*(..))")
	public void exec4() {
	}

	// within some type - any class in cars package
	@Pointcut("within(org.spring.course.cars.*)")
	public void exec5() {
	}

	// methods with param list signature(int, int)
	@Pointcut("args(int, int)")
	public void exec6() {
	}

	// methods with param list signature(int, int)
	@Pointcut("args(temp)")
	public void exec7(int temp) {
	}

	/*
	 * @Before("exec6()") public void testAdvice() {
	 * System.out.println("Test advice"); }
	 */
	
	@Before("exec7(temp)")
	public void testAdvice(int temp) {
		System.out.println("Value received: " + temp);
	}
}
