package test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//�޿� ��� ���ϱ�
public class UserMain2 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("bean.xml");
		
		UserDaoImpl ob = (UserDaoImpl)factory.getBean("test1");
		//������ �ϼ��Ͻÿ�
		
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
//[��� ȭ��]
//��ü �޿� ��� : 625000.0
