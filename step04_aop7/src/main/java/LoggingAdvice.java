import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class LoggingAdvice implements MethodInterceptor{

	public Object invoke(MethodInvocation invo) throws Throwable {
		String methodName = invo.getMethod().getName();
		StopWatch sw=new StopWatch();
		
		sw.start(methodName);
		
		System.out.println("From [bean1.xml]");
		System.out.println("[LOG]METHOD : " + methodName + "is calling");
		Object obj=invo.proceed();

		sw.stop();
		System.out.println("[LOG]METHOD : " + methodName + "is called");
		System.out.println("[LOG]처리시간: " + sw.getTotalTimeMillis()/1000 + "초");
		
		return obj;
	}

	public void logAround(ProceedingJoinPoint jp) throws Throwable{
		String methodName = jp.getSignature().getName();
		StopWatch sw = new StopWatch();

		System.out.println("From [bean2.xml]");
		System.out.println("[LOG]METHOD : " + methodName + " is Calling");
		sw.start();

		jp.proceed();

		sw.stop();
		System.out.println("[LOG]METHOD : " + methodName + " was done");
		System.out.println("[LOG]ó���ð� : " + sw.getTotalTimeMillis()/1000 + " ��");
	}
	
}
