package test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcExample3 {
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("test03/applicationContext.xml");
		
		FirstJdbcDao dao =(FirstJdbcDao)factory.getBean("test");
		int count=dao.delete(args[0]);  //�̸����� ����
		
		System.out.println(args[0] + "���簡 " + count + "�� ���� �Ǿ����ϴ�");
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
