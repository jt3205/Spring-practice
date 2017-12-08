package test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* [����] p0001�� jQuery, 35000, �����ͽ��� �����Ͻÿ�
 * 
 * [���] ��ǰ 1���� �����Ͽ����ϴ�
 */
public class JdbcExample6 {
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("test02/applicationContext.xml");
		
		FirstJdbcDao dao=(FirstJdbcDao)factory.getBean("test");
		int n=dao.update("jQuery", 35000, "�����ͽ�", "p0001");
		if(n>0)
			System.out.println("��ǰ " + n + "���� �����Ͽ����ϴ�");
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}






