package sample6;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutput implements Outputter {

	private String filePath; // �������Ͽ� ���� ��ο� �����̸��� ������ �ʵ�
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
		System.out.println("2.���ϰ�ο� ���� �̸�����");
	}
	
	@Override
	public void output(String message) throws IOException {
		FileWriter out = new FileWriter(filePath);
		out.write(message);
		out.close();
		System.out.println("5.���� ���� ����!");
	}
	
}
