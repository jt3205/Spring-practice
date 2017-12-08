package test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//[����]  p0001��   jQuery, 35000, �����ͽ��� �����Ͻÿ�
//
//[���]  ��ǰ 1���� �����Ͽ����ϴ�
public class JdbcExample6 {
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("test03/applicationContext.xml");
		
		GoodsEntity entity=new GoodsEntity();
		entity.setCode("p0002");
		entity.setName("jQuery Mobile");
		entity.setPrice(50000);
		entity.setMaker("���Ĺͽ�");
		
		FirstJdbcDao dao=(FirstJdbcDao)factory.getBean("test");
		
		int n=dao.updateGoods(entity);
		if(n > 0)
			System.out.println("��ǰ " + n +"���� �����Ͽ����ϴ�");
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}





