package test1;

public class CalcMul implements Calc {
	int x;
	int y;

	@Override
	public int calculate() {
		return x - y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return x+" - "+y+" = "+calculate();
	}
}
