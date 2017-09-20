package sample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample1/beans.xml");
		MessageBean mb = (MessageBean)factory.getBean("messageBean");
		mb.sayHello();
		((ClassPathXmlApplicationContext)factory).close();
	}
}
