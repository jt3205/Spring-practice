package test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//�߰��ϱ�(insert)
public class JdbcExample2 {
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("test03/applicationContext.xml");
		
		GoodsEntity entity=new GoodsEntity();
		entity.setCode("p0010");
		entity.setName("������");
		entity.setPrice(35000);
		entity.setMaker("����Ż�ڽ�");
		
		FirstJdbcDao dao=(FirstJdbcDao)factory.getBean("test");
		int count=dao.insert(entity);
		
		System.out.println(count + "���� ����Ÿ�� �Է� �Ǿ����ϴ�");
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
