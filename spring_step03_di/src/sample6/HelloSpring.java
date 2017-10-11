package sample6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample6/applicationContext.xml");
		
		System.out.println("End");
		MessageBean bean=(MessageBean)factory.getBean("messageBean");
		bean.helloCall();		
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}

/*
1.Bean�� ������ ȣ�� 
2.���� ��ο� ���� �̸� ����
3.phone�Է¹���
4.outputter�� �Է¹���
** End **
�̼���:123-4567
5.�������ۼ���
6.�۾���
*/
