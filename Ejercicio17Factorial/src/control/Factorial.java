package control;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int number;
		System.out.println("Introduce un numero para calcular el factorial");
		
		Scanner scanner = new Scanner(System.in);
		
		number = scanner.nextInt();
		
		scanner.close();
		
		long fact = 1;
		
		int i = 1;
		while(i <= number){
			fact = fact * i;
			i++;
		}
		 System.out.println("Factorial of "+number+" is: "+fact);

	}

}