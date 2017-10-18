import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AdviceEx {
    //@Before("within(aop8.CoreEx)")
    @Before("within(CoreEx)")
    public void before() {
        System.out.println("Joinpoint앞에섯 리행되는 Advice");
    }

    //@AfterThrowing(pointcut="within(aop08.CoreEx)", throwing="e" )
    @AfterThrowing(pointcut = "within(CoreEx)", throwing = "e")
    public void afterThrowing(Throwable e) {
        System.out.println("���ܰ� ����ɶ� ȣ��Ǵ� Advice");
        System.out.println(e.getMessage());
    }

    //@AfterReturning(pointcut="within(aop08.CoreEx)", returning="ret" )
    @AfterReturning(pointcut="within(CoreEx)", returning="ret" )
    public void afterReturing(Object ret) {
        System.out.println("Joinpoint가 정상 종료 후 실행되는 Advice");
    }

    //@After("within(aop08.CoreEx)")
    @After("within(CoreEx)")
    public void after() {
        System.out.println("Joinpoint 뒤에서 실행되는 Advice");
    }

    //@Around("within(aop08.CoreEx)")
    @Around("within(CoreEx)")
    public Object around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("Joinpoint 전역에서 실행되는 Advice");
        return jp.proceed();
    }
}

/*  Annotation(어노테이션)
  - Aspect어노테이션을 이용하여 aspect 클래스에 직접 어드바이스와 포인트컷 등을 설정한다
  - <aop:aspectj-autoproxy/>�� �߰�
  - Aspect Class�� <bean>���� ���

 @Aspect : AspectŬ���� ����
 @Before("pointcut")
 @AfterReturning(pointcut="", returning="")
 @AfterThrowing(pointcut="", throwing="")
 @After("pointcut")
 @Around("point")

  Around�� ������ ������ �޼������ ù��° ���ڰ����� JoinPoint�� ������ �ִ�
  Around�޼���� ���ڷ� ProceedingJoinPoint�� ������ �ִ�
*/
