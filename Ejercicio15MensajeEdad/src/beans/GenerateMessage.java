package beans;

import java.util.Scanner;

public class GenerateMessage {
	Scanner sc = new Scanner(System.in);
	int age;
	
	public void setMessage() {
		System.out.println("Por favor, introduce tu edad");
		age = sc.nextInt();
		if(age >0 && age <= 4){
			System.out.println("Eres pequeñín");
		}else if(age > 4 && age <= 10){
			System.out.println("Eres un niño");
		}else if(age > 10 && age <= 40){
			System.out.println("Eres adolescente");
		}else if(age > 40 && age <= 80) {
			System.out.println("Eres talludito");
		}else {
			System.out.println("Estas fuera de rango!!");
		}
	}
}
