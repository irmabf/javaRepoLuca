package domain;

public class Punto {
	private int px;
	private int py;
	
	public Punto(){}
	
	public Punto(){
		this.px = px;
		this.py = py;
		
	}
	
	public int getPx(){
		return px;
	}
	
	public void setPx(int px){
		this.px = px;
	}
	
	public int getPy(){
		return py;
	}
	
	public void setPy(){
		this.py = py;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + px;
		result = prime * result + py;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		if (px != other.px)
			return false;
		if (py != other.py)
			return false;
		return true;
	}

	
	
}



