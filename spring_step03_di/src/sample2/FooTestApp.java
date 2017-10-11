package sample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FooTestApp {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample2/applicationContext.xml");
		System.out.println("** Container �ʱ�ȭ �۾� �Ϸ� **");
		
		System.out.println("\n\nscope(singleton / property) Ȯ��");
		InterFoo ob1 = (InterFoo)factory.getBean("foo1");
		System.out.println(ob1);
		InterFoo ob2 = (InterFoo)factory.getBean("foo1");
		System.out.println(ob2);
		InterFoo ob3 = (InterFoo)factory.getBean("foo1");
		System.out.println(ob3);
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
