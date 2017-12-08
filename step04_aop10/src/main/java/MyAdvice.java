import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAdvice {
    @After("execution(public String Human.sayName(..))")
    void beforeSaying(){
        System.out.println("당신의 이름은 무엇입니까?");

    }

    @After("execution(public String Human.sayName(..))")
    void afterSaying(){
        System.out.println("이름이 멋지시네요");

    }

    void afterReturnSaying(){
        System.out.println("직업이 무엇입니까?");

    }

}
