package beans;

public class IceCream {
	private ScoopEnumeration size;
	private Topping topping;
	private String name;
	
	public IceCream(){}
	
	public IceCream(ScoopEnumeration size){
		super();
		this.size = size;
	}
	public IceCream(String name, Topping topping, ScoopEnumeration size){
		super();
		this.name = name;
		this.topping = topping;
		this.size = size;
		
	}

	public ScoopEnumeration getSize() {
		return size;
	}

	public void setSize(ScoopEnumeration size) {
		this.size = size;
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
		builder.append("IceCream [size=");
		builder.append(size);
		builder.append(", topping=");
		builder.append(topping);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}