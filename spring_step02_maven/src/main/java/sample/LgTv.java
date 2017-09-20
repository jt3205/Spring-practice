package sample;

public class LgTv implements Tv{

	@Override
	public void powerOn() {
		System.out.println("LG TV - ������ �Ҵ�");
	}

	@Override
	public void powerOff() {
		System.out.println("LG TV - ������ ����");
	}

	@Override
	public void volumeUp() {
		System.out.println("LG TV - �Ҹ��� ���δ�");
	}

	@Override
	public void volumeDown() {
		System.out.println("LG TV - �Ҹ��� ���δ�");
	}

}
