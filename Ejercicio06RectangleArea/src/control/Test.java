package control;

import java.util.Scanner;

import beans.RectangleDimensions;

public class Test {
	
	public void createRectangle(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert a double for the base");
		
		double baseR = sc.nextDouble();
			
		System.out.println("The base is: " + baseR);
		
		System.out.println("Insert a double for the height");
			
		double heightR = sc.nextDouble();
		
		RectangleDimensions myRectangle = new RectangleDimensions(baseR, heightR);
		
		System.out.println("The area of the given rectangle is " + myRectangle.getArea());
	}
	
	
	

}
