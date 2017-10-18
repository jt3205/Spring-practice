import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HumanMain {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("bean.xml");
		Human ob1= factory.getBean("per1", Human.class);
		System.out.println(ob1.sayName("뽀로로"));
		System.out.println("--------------------------------\n");

		Human ob2= factory.getBean("per2", Human.class);
		System.out.println(ob2.sayName("둘리"));
		System.out.println("--------------------------------\n");

		Human ob3= factory.getBean("per3", Human.class);
		System.out.println(ob3.sayName("텔레토비"));
		System.out.println("--------------------------------\n");




        ((ClassPathXmlApplicationContext)factory).close();
	}
}
