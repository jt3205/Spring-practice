import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoreMain {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("bean.xml");

        CoreEx ex = factory.getBean("core",CoreEx.class);
        try {
            ex.zeroMethod(5,3);
        }catch (Exception e ){

        }

        ((ClassPathXmlApplicationContext) factory).close();
    }
}
