package sample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FooTestApp {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample2/applicationContext.xml");
		System.out.println("** Container �ʱ�ȭ �۾� �Ϸ� **");
		((ClassPathXmlApplicationContext)factory).close();
	}
}
