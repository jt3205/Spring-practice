package sample5;

//�������� �̿��ؼ� ���յ��� ����
public class TvUser {
	public static void main(String[] args) {
		Tv tv = new LgTv();
		// Tv tv=new SamsungTv();

		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}
}