package test03;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//��ü����-2
public class JdbcExample4 {
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("test03/applicationContext.xml");
		
		FirstJdbcDao dao=(FirstJdbcDao)factory.getBean("test");
		List<GoodsEntity> list=dao.listGoods();
		
		for(GoodsEntity entity: list)
		{
			System.out.print("�ڵ� : " + entity.getCode() +"\t");
			System.out.print("å�̸� : " + entity.getName() +"\t");
			System.out.print("���� : " + entity.getPrice() +"\t");
			System.out.print("���ǻ� : " + entity.getMaker() +"\n");
		}
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
//�ڵ� : p0001    å�̸� : �ڹٹ�����    ���� : 25000     ���ǻ� : ��������