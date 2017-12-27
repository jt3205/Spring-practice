package test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//추가하기
public class UserMain3 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("bean.xml");
		
		UserDaoImpl ob = (UserDaoImpl)factory.getBean("test2");
		//나머지 완성하시오
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
// [결과화면]
// 1개 행이 추가 되었습니다   또는   추가 실패 입니다
//
//
// [추가할 데이타]
// 마이콜  서울시 영등포구 여의도동 83000