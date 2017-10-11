package sample5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BirthdayEx {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample5/date.xml");
		System.out.println("** Container 초기화 작업 완료 **");
		DateVO vo1 = factory.getBean("hong", DateVO.class);
		System.out.println(vo1.toString());
		
		DateVO vo2 = factory.getBean("lee", DateVO.class);
		System.out.println(vo2.toString());
		
		((ClassPathXmlApplicationContext)factory).close();
	}

}
