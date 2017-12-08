package test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//추가하기
public class JdbcExample2 {
	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("test01/applicationContext.xml");
		
		FirstJdbcDao dao=(FirstJdbcDao)factory.getBean("test");
//		int count=dao.insert("p0003", "스프링", 34000, "제이펌");
		int count=dao.insert("p0004", "Ajax", 25000, "한빛출판");
		
		System.out.println(count + "행 데이타가 입력되었습니다");
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}






