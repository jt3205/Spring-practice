package test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//삭제하기
public class JdbcExample3 {
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("test01/applicationContext.xml");
		
		FirstJdbcDao dao=factory.getBean("test", FirstJdbcDao.class);
		int count=dao.delete(args[0]);  //이름으로 삭제
		System.out.println(args[0] + "교제  " + count +"건이 삭제 되었습니다");
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}





