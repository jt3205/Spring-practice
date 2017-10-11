package sample7;

public class Engineer extends Emp{
	String dept;
	public Engineer() {
		
	}
	public Engineer(String name, int salary) {
		super(name,salary);
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	@Override
	public String toString() {
		return super.toString()+" ºÎ¼­ : "+getDept();
	}
}
