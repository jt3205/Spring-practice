package sample8;

public class Developer {
	private Emp emp;
	private String dept;
	public Developer() {
		
	}
	public Developer(Emp emp, String dept) {
		this.emp = emp;
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	@Override
	public String toString() {
		return emp.toString()+" ºÎ¼­ : "+getDept();
	}
}
