package calci;

public class calculator {
	
	private long a;
	private long b;
	
	public calculator (){

	}
	public void setA(long a) {
		this.a = a;
	}
	public void setB(long b) {
		this.b = b;
	}
	public long getA() {
		return a;
	}
	public long getB() {
		return b;
	}
	@Override
	public String toString() {
		return "Calculator [a=" + a + ", b=" + b + "]";
	}
	
	
}

