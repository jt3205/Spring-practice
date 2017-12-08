package aop04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("excution(public void aop04.*.*(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("교실문을 연다");
	}
	@After("excution(public void aop04.*.*(..))")
	public void after(JoinPoint joinPoint) {
		System.out.println("교실문을 닫는다");
	}
}




