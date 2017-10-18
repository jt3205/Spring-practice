import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
    @Before("execution(public void aop04.*.*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("교실 문을 연다");
    }

    @AfterThrowing(pointcut = "execution(public void aop04.*.*(..))", throwing = "e")
    public void throwing(JoinPoint joinPoint, Throwable e){
        System.out.println("** 휴강일 **");
    }

    @After("execution(public void aop04.*.*(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println("교실 문을 닫는다");
    }
}
