package sample6;

import java.io.IOException;

public class MessageBeanImpl implements MessageBean{
	private String name;
	private String phone;
	private Outputter outputter;
	
	//�����ڷ� name�� ����
	public MessageBeanImpl(String name) {
		super();
		this.name = name;
		System.out.println("1.Bean�� ������ ȣ��");
	}

	//setter�� ���ؼ� phone�� outputter �Է¹���
	public void setPhone(String phone) {
		this.phone = phone;
		System.out.println("3.phone�� �Է¹���");
	}
	
	public void setOutputter(Outputter outputter) {
		this.outputter = outputter;
		System.out.println("4.outputter�� �Է¹���");
	}

	public void helloCall() {
		String message = name + " : " + phone;
		System.out.println(message);
		
		try {
			outputter.output(message);
			System.out.println("6.�۾���");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
