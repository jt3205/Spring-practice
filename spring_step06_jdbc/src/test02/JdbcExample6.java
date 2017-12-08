package test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* [문제] p0001를 jQuery, 35000, 인포믹스로 변경하시오
 * 
 * [결과] 상품 1개를 수정하였습니다
 */
public class JdbcExample6 {
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("test02/applicationContext.xml");
		
		FirstJdbcDao dao=(FirstJdbcDao)factory.getBean("test");
		int n=dao.update("jQuery", 35000, "인포믹스", "p0001");
		if(n>0)
			System.out.println("상품 " + n + "개를 수정하였습니다");
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}






