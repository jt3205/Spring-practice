package aop02;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invo) throws Throwable {
		Object returnValue=null;
		
		//��� �޼��� ������
		System.out.println("���ǹ��� ����");
		
		try {
			//��� �޼��� ����
			returnValue=invo.proceed();
		}catch(Exception e) {
			System.out.println("**������ �ް��� **");
		}finally {
			System.out.println("������ ���� �Ѵ�");
		}
		
		//��� �޼��� ������
		System.out.println("���ǹ��� ��ٴ�");
		
		return returnValue;
	}
}




