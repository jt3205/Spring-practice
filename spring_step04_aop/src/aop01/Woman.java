package aop01;

public class Woman {
	public void classwork() {
		System.out.println("���ǹ��� ����");
		
		try {
			System.out.println("��ǻ�͸� �Ѱ� ���� ������ Ȯ�� �Ѵ�");
		}catch(Exception e){
			System.out.println("���� ���³�");
		}finally {
			System.out.println("���� ���� �����Ѵ�");
		}
		
		System.out.println("���ǹ��� ��ٴ�");
	}
}
