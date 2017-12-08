import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalcMain {

    public static void main(String[] args) throws Exception {
        ApplicationContext factory = new ClassPathXmlApplicationContext("bean.xml");
        CalcMethod calc = factory.getBean("calc", CalcMethod.class);
        calc.div(5,4);
        calc.sum(5,4);

        ((ClassPathXmlApplicationContext) factory).close();
    }
}
