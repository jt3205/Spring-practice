package test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("test1/beans.xml");
		System.out.println("----------------스프링 시작----------------");
		Calc bean;
		bean = (Calc) context.getBean("add");
		System.out.println(bean.toString());

		bean = context.getBean("mul", Calc.class);
		System.out.println(bean.toString());
		((ClassPathXmlApplicationContext) context).close();
		System.out.println("----------------스프링 끝----------------");
	}
}
