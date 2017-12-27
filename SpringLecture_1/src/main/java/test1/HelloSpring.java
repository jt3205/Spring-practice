package test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("test1/bean.xml");
		Grade bean=(Grade)context.getBean("grade");
		System.out.println(bean.toString());
	}
}
