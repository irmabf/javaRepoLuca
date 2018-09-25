package beans;

public class Rectangle {
	private int base;
	private int height;
	private int area;
	
	public Rectangle(int base, int height){
		this.base = base;
		this.height = height;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [base=" + base + ", height=" + height + ", area=" + area + "]";
	}

	
}
