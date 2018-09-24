package beans;

import java.util.Scanner;

public class ParOImpar {
	Scanner sc = new Scanner(System.in);
	int number;
	
	
	public void checkNumber(){
		System.out.println("Introduce un numero para comprobar si es par o impar");
		number = sc.nextInt();
		
		if (number % 2 == 0){
			System.out.println("El numero, " + number + " es par.");
		}else{
			System.out.println("El numero, " + number + " es impar.");
		}
	}
	}
