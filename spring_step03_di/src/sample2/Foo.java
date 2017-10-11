package sample2;

public class Foo implements InterFoo{
	String str;
	public Foo() {
		System.out.println("Foo 按眉 积己 : Foo() 龋免");
		System.out.println("---------------------");
	}
	public Foo(String str) {
		System.out.println("Foo 按眉 积己 : Foo(String) 龋免");
		System.out.println("傈崔等 String 按眉 : "+str);
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
		System.out.println("Foo 按眉积己 : Foo(bar) 龋免");
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
