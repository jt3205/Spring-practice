package test1;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// �̸��� "��" �ڰ� ���ԵǾ� �ִ� ������ ã��
public class UserMain4 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("bean.xml");
		
		UserDaoImpl ob = (UserDaoImpl)factory.getBean("test1");

		List list=ob.selectSearch("��");
		Iterator iter=list.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		((ClassPathXmlApplicationContext)factory).close();
	}
}
//[���ȭ��]
//{NO=1, NAME=�Ѹ�, ADDR=����� ������ ��â��, SAL=750000}
//{NO=2, NAME=���Ѹ�, ADDR=����� ������ ��, SAL=750000}
//{NO=3, NAME=�Ѹ�¯, ADDR=����� ������ ��â��, SAL=450000}