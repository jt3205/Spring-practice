package sample1;

public class MessageBeanImpl implements MessageBean {
	private String fruit;
	private int cost;
	
	public MessageBeanImpl() {
		super();
	}
	
	public MessageBeanImpl(String fruit) {
		super();
		this.fruit = fruit;
		System.out.println("MessageBeanImpl ������ ȣ��");
	}

	public void setCost(int cost) {
		this.cost = cost;
		System.out.println("setCost() ȣ��");
	}
	
	@Override
	public void sayHello() {
		System.out.println(fruit +"  "+cost);
	}

	@Override
	public void sayHello(String a, int b) {
		System.out.println(a+"  "+b);
	}

}
