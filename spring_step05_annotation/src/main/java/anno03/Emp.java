package anno03;

public class Emp {
	private String name;
	private int age;
	private double score;
	
	public Emp(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return name + "은 " + age + "세 이고 입사점수는" + score + "점 입니다";
	}
	
	
}
