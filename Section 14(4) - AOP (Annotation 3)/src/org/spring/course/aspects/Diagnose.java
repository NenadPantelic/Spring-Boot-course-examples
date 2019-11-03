package org.spring.course.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Diagnose {

	@Pointcut("target(org.spring.course.cars.PetrolCar)")
	public void targetPointcut() {
	}

	@Pointcut("bean(petrolCar)")
	public void beanPointcut() {
	}

	@Pointcut("bean(*lCar)")
	public void beanPointcut2() {
	}

	@Before("targetPointcut()")
	public void targetAdvice() {
		System.out.println("targetAdvice");
	}

	@Before("beanPointcut()")
	public void targetAdvice2() {
		System.out.println("before beanPointcut");
	}

	@Before("beanPointcut2()")
	public void targetAdvice3() {
		System.out.println("before beanPointcut2");
	}

	@Pointcut("@target(org.springframework.stereotype.Component)")
	public void targetPointcut2() {
	}

	@Pointcut("@annotation(Deprecated)")
	public void annotationPointcut() {
	}

	@Before("targetPointcut2()")
	public void beforeTargetPointcut2() {
		System.out.println("Before target annotation");
	}

	@Before("annotationPointcut()")
	public void beforeAnnotationPointcut2() {
		System.out.println("Before @ annotation");
	}

	@Pointcut("@args(Deprecated)")
	public void argsPointcut() {
	};

	@Before("argsPointcut()")
	public void argsAdvice() {
		System.out.println("Args adviced called - before @args");
	}

	// to combine pointcuts use && - and; pointcut1 && pointcut2, || - or; pointcut1
	// || pointcut2
}
