package springcore_example;

public class Triangle {
	
	private String type;
//	private int height;

//	public int getHeight() {
//		return height;
//	}
//
//	public void setHeight(int height) {
//		this.height = height;
//	}

//	public void setType(String type) {
//		this.type = type;
//	}



	public String getType() {
		return type;
	}

	public Triangle(String type) {
		
		this.type = type;
		
	}

	public void draw() {
		System.out.println(getType() +" Triangle is drawn.");
	}
}
