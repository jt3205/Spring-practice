package test1;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//��ü����
public class UserMain1 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("bean.xml");

		UserDaoImpl ob = (UserDaoImpl)factory.getBean("test1");
		//������ �ϼ��Ͻÿ�

		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
//[���ȭ��]
//1	�Ѹ�	����� ������ ��â��	750000.0
//2	���Ѹ�	����� ������ ��	750000.0
//3	�Ѹ�¯	����� ������ ��â��	450000.0
//4	��ġ	����� ���ʱ� ���ʵ�	550000.0