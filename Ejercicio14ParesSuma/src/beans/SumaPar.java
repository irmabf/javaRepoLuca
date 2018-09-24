package beans;

public class SumaPar {
	public void countEvenNumbers(){
		int targetEventCount = 14;
		int currentEventCount = 0;
		
		for (int i = 1; currentEventCount<targetEventCount; i++){
			if(i % 2 == 0){
				currentEventCount++;
				System.out.println("Even number: " + i);
			}
		}	
	}
}
