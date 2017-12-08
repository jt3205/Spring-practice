package aop02;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invo) throws Throwable {
		Object returnValue=null;
		
		//대상 메서드 실행전
		System.out.println("교실문을 연다");
		
		try {
			//대상 메서드 실행
			returnValue=invo.proceed();
		}catch(Exception e) {
			System.out.println("**오늘은 휴강일 **");
		}finally {
			System.out.println("교실을 점검 한다");
		}
		
		//대상 메서드 실행후
		System.out.println("교실문을 잠근다");
		
		return returnValue;
	}
}




