package sample6;

//Factory ������ �̿��ؼ� ���յ��� ����
public class TvUser {
	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		Tv tv = (Tv)factory.getBean(args[0]);
		// Tv tv=new SamsungTv();

		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}
}