package test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//�����ϱ�
public class JdbcExample3 {
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("test01/applicationContext.xml");
		
		FirstJdbcDao dao=factory.getBean("test", FirstJdbcDao.class);
		int count=dao.delete(args[0]);  //�̸����� ����
		System.out.println(args[0] + "����  " + count +"���� ���� �Ǿ����ϴ�");
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}





