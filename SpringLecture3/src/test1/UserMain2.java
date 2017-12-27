package test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//급여 평균 구하기
public class UserMain2 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("bean.xml");
		
		UserDaoImpl ob = (UserDaoImpl)factory.getBean("test1");
		//나머지 완성하시오
		
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
//[결과 화면]
//전체 급여 평균 : 625000.0
