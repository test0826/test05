package test;

public class Test {

	
		
	private int a = 10;
	private double b = 10.0;
	
	public Test() {
	}

	public Test(int a, double b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
	
		
		

	

}
