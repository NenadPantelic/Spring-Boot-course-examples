package org.spring.course.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Diagnose {

	/*
	 * @Before("execution(void org.spring.course.cars.PetrolCar.run())") public void
	 * checkEngine() { System.out.println("Checking engine..."); }
	 * 
	 * @After("execution(void org.spring.course.cars.PetrolCar.run())") public void
	 * checkEngineAfter() { System.out.println("Checking engine again..."); }
	 */

	
	  @Pointcut("execution(void org.spring.course.cars.PetrolCar.run())") public
	  void exec() { }
	  
	/*
	 * @Before("exec()") public void before() {
	 * System.out.println("Called before..."); }
	 * 
	 * // will be called even if an exception is thrown
	 * 
	 * @After("exec()") public void after() { System.out.println("Called after...");
	 * }
	 */
	// @AfterReturning - for situation where we want to be executed only if there is
	// no exceptions

	/*
	 * @AfterReturning("exec()") public void afterReturning() {
	 * System.out.println("Called after returning..."); }
	 * 
	 * // called after exception is thrown
	 * 
	 * @AfterThrowing("exec()") public void afterThrowing() {
	 * System.out.println("Called after throwing..."); }
	 */
	@Around("exec()")
	public void arroundAdvice(ProceedingJoinPoint jp) {
		System.out.println("Arround advice initial message");
		try {
			jp.proceed();
		} catch (Throwable e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Arround advice later message");
	}

}
