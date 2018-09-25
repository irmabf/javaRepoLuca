package beans;

public class RectangleDimensions {
	
	private double base;
	private double height;
		
	public RectangleDimensions(){
		
	}
	
	public RectangleDimensions(double base, double height) {
		super();
		this.base = base;
	    this.height = height;
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea(){
		return base * height;
	}

	@Override
	public String toString() {
		return "Base= " + base + ", height= " + height + ". Area "+ getArea();
	}
	
	

}
