package aop01;

public class StartMain {
	public static void main(String[] args) {
		Woman w=new Woman();
		Man m=new Man();
		
		System.out.println("** ���л� ���� **");
		w.classwork();
		System.out.println("--------------------------");
		System.out.println("** ���л� ���� **");
		m.classwork();
	}
}
