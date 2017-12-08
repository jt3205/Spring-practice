package test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//추가하기(insert)
public class JdbcExample2 {
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("test03/applicationContext.xml");
		
		GoodsEntity entity=new GoodsEntity();
		entity.setCode("p0010");
		entity.setName("리눅스");
		entity.setPrice(35000);
		entity.setMaker("디지탈박스");
		
		FirstJdbcDao dao=(FirstJdbcDao)factory.getBean("test");
		int count=dao.insert(entity);
		
		System.out.println(count + "행의 데이타가 입력 되었습니다");
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
