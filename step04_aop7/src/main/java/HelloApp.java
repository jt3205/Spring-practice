import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {

        ApplicationContext factory = new ClassPathXmlApplicationContext("bean2.xml");

        MessageBean bean = factory.getBean("proxy", MessageBean.class);
        bean.sayHello();
        ((ClassPathXmlApplicationContext) factory).close();

    }
}
