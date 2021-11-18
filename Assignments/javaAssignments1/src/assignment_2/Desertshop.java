package assignment_2;

class DesertItem {
private float tax;
	public float gettax() {
	return tax;
	}

	public void settax(float tax) {
		this.tax = tax;
	}
}

class candy extends DesertItem {
	public int cost;
	
}

public class Desertshop {

	public static void main(String[] args) {
		candy candy=new candy();
		candy.settax(43);
	       
	       System.out.println(candy.gettax());
	}

}
