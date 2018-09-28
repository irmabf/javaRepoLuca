package beans;

public enum Topping {
	
	FRESA("fresa"),
	NATA("nata con nueces"),
	CHOCOLATE("chocolate con fondant");
	
	private final String topping;
	
	//Constructor
	private Topping(String topping){
		this.topping = topping;
	}
	
	public String getTopping(){
		return topping;
	}
}
