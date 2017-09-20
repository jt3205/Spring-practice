package sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//beans.xml�� �̿��ؼ� ���յ��� ����
public class TvUser {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample7/beans.xml");
		Tv tv = (Tv)factory.getBean(args[0]);
		// Tv tv=new SamsungTv();

		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}
}