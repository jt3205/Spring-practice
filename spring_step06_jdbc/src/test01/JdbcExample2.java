package test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//�߰��ϱ�
public class JdbcExample2 {
	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("test01/applicationContext.xml");
		
		FirstJdbcDao dao=(FirstJdbcDao)factory.getBean("test");
//		int count=dao.insert("p0003", "������", 34000, "������");
		int count=dao.insert("p0004", "Ajax", 25000, "�Ѻ�����");
		
		System.out.println(count + "�� ����Ÿ�� �ԷµǾ����ϴ�");
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}






