package beans;

public enum ScoopEnumeration {
	MINI(2),
	SUPER(3),
	MEGA(5);
	
	
	private final int numScoops;
	
	private ScoopEnumeration(int numScoops){
		this.numScoops = numScoops;
	}
	
	public int getNumOfScoops(){
		return numScoops;
	}
	
}
