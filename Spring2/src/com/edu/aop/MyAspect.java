package com.edu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("execution(public void *(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("도형의 넓이를 구한다");
	}
	@After("execution(public void *(..))")
	public void after(JoinPoint joinPoint) {
		System.out.println("도형의 넓이를 출력한다");
	}
}
