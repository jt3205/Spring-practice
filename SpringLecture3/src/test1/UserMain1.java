package test1;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//전체보기
public class UserMain1 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("bean.xml");

		UserDaoImpl ob = (UserDaoImpl)factory.getBean("test1");
		//나머지 완성하시오

		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
//[결과화면]
//1	둘리	서울시 강서구 염창동	750000.0
//2	강둘리	서울시 강서구 목동	750000.0
//3	둘리짱	서울시 강서구 염창동	450000.0
//4	또치	서울시 서초구 서초동	550000.0