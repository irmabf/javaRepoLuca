package beans;

import java.util.Scanner;

public class MayoriaEdad {
	
	
	private static int MAYORIA_EDAD = 18;
	Scanner sc = new Scanner(System.in);
	int number;
	
	public void isGrownUp(){
		System.out.println("Introduce tu edad");
		number = sc.nextInt();
		if(number >= MAYORIA_EDAD){
			System.out.println("Eres mayor de edad");
		}else{
			System.out.println("Eres menor de edad");
		}
	}

}
