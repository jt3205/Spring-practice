package sample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//의존관계를 약하게 설정하는 프로그램(결합도를 낮춤)
public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");

		MessageBean mb = (MessageBean) factory.getBean("messageBean");
		mb.sayHello("Spring");

		((ClassPathXmlApplicationContext) factory).close();
	}
}