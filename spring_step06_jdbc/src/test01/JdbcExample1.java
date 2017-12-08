package test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//전체검색(select)
public class JdbcExample1 {
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("test01/applicationContext.xml");

		FirstJdbcDao dao=(FirstJdbcDao)factory.getBean("test");
		dao.execute("SELECT * FROM GOODSINFO");
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}







