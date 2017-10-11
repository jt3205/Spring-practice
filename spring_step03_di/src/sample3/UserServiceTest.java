package sample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserServiceTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample3/applicationContext.xml");
		System.out.println("** Container 초기화 작업 완료 **");

		UserService user1 = (UserService)factory.getBean("userService");
		UserVO vo = new UserVO("박형진");
		user1.addUser(vo);
		System.out.println(user1);
		System.out.println("-------------------------------------");
		UserService user2 = (UserService)factory.getBean("userService");
		UserVO vo2 = new UserVO("바켱진");
		user2.addUser(vo2);
		System.out.println(user2);
		System.out.println("-------------------------------------");
		
		((ClassPathXmlApplicationContext)factory).close();
	}

}
