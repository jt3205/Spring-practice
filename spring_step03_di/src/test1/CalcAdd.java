package test1;

public class CalcAdd implements Calc {
	int x;
	int y;
	
	public CalcAdd(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int calculate() {
		return x + y;
	}
	@Override
	public String toString() {
		return x+" + "+y+" = "+calculate();
	}
}
