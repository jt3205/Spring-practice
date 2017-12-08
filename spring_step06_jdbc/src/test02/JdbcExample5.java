package test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//코드로 1건의 데이터를 출력
public class JdbcExample5 {
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("test02/applicationContext.xml");
		
		FirstJdbcDao dao=(FirstJdbcDao)factory.getBean("test");
		GoodsEntity entity=dao.findGoods(args[0]);
		
		System.out.println(entity.getCode()+"    " +entity.getName() +"   "
		                   + entity.getPrice() + "    " + entity.getMaker());
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}






