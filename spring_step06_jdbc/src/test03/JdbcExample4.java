package test03;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//전체보기-2
public class JdbcExample4 {
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("test03/applicationContext.xml");
		
		FirstJdbcDao dao=(FirstJdbcDao)factory.getBean("test");
		List<GoodsEntity> list=dao.listGoods();
		
		for(GoodsEntity entity: list)
		{
			System.out.print("코드 : " + entity.getCode() +"\t");
			System.out.print("책이름 : " + entity.getName() +"\t");
			System.out.print("가격 : " + entity.getPrice() +"\t");
			System.out.print("출판사 : " + entity.getMaker() +"\n");
		}
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
//코드 : p0001    책이름 : 자바무따기    가격 : 25000     출판사 : 공갈닷컴