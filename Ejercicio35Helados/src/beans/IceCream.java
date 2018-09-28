package beans;

public class IceCream {
	private Cream theCream;
	private Topping theTopping;
	private String name;
	
	/**
	 * We have 3 constructors:
	 * 
	 * 1. A default empty constructor
	 * 2. A constructor in which we will provide
	 * only the cream.
	 * 3. A constructor for the cream, the topping and
	 * the name of the iceCream.
	 * */
	public IceCream(){}
	
	public IceCream(Cream theCream){
		super();
		this.theCream = theCream;
	}
	
	public IceCream(Cream cream, Topping topping, String name){
		super();
		this.theCream = theCream;
		this.theTopping = pping;
		this.name = name;
	}

	public Cream getCream() {
		return cream;
	}

	public void setCream(Cream cream) {
		this.cream = cream;
	}

	public Topping getTopping() {
		return topping;
	}

	public void setTopping(Topping topping) {
		this.topping = topping;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IceCream [cream=");
		builder.append(cream);
		builder.append(", topping=");
		builder.append(topping);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
}















