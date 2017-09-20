package sample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//�������踦 ���ϰ� �����ϴ� ���α׷�(���յ��� ����)
public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");

		MessageBean mb = (MessageBean) factory.getBean("messageBean");
		mb.sayHello("Spring");

		((ClassPathXmlApplicationContext) factory).close();
	}
}