import org.aspectj.lang.annotation.*;

@Aspect
public class CalcAdvice {
    @Before("execution(public * *(..))")
    public void before() {
        System.out.println("** 연산시작 **");
    }

    @After("execution(public * *(..))")
    public void after() {
        System.out.println("** 연산종료 **\n");
    }
}













