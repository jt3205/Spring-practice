package test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//�߰��ϱ�
public class UserMain3 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("bean.xml");
		
		UserDaoImpl ob = (UserDaoImpl)factory.getBean("test2");
		//������ �ϼ��Ͻÿ�
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
// [���ȭ��]
// 1�� ���� �߰� �Ǿ����ϴ�   �Ǵ�   �߰� ���� �Դϴ�
//
//
// [�߰��� ����Ÿ]
// ������  ����� �������� ���ǵ��� 83000