package sample7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//beans.xml을 이용해서 결합도를 낮춤
public class TvUser {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
		Tv tv = (Tv)factory.getBean(args[0]);
		// Tv tv=new SamsungTv();

		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}
}