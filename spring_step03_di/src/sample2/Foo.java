package sample2;

public class Foo implements InterFoo{
	String str;
	public Foo() {
		System.out.println("Foo ��ü ���� : Foo() ȣ��");
		System.out.println("---------------------");
	}
	public Foo(String str) {
		System.out.println("Foo ��ü ���� : Foo(String) ȣ��");
		System.out.println("���޵� String ��ü : "+str);
		System.out.println("---------------------");
	}
	public Foo(int num, String str){
		System.out.println("num = "+num);
		System.out.println("str = "+str);		
	}
	public Foo(int num, String str, boolean bool) {
		System.out.println("num = "+num);
		System.out.println("str = "+str);	
		System.out.println("bool = "+bool);
	}
	public Foo(int num,  boolean bool, String str) {
		System.out.println("num = "+num);
		System.out.println("bool = "+bool);
		System.out.println("str = "+str);
	}
	public Foo(Bar bar) {
		System.out.println("Foo ��ü���� : Foo(bar) ȣ��");
		System.out.println("Bar = "+bar.toString());
	}
	
	
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		System.out.println("Setter str : "+str);
		this.str = str;
	}
}
