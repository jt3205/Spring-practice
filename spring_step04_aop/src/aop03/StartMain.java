package aop03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartMain {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("aop03/applicationContext.xml");
		
		Person my = (Person)factory.getBean(args[0]);
		my.classwork();
		
		((ClassPathXmlApplicationContext)factory).close();
	
	}
}
