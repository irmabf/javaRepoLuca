package beans;

import java.util.Scanner;

public class Menu {
	private Scanner in;

	public void showMenu() {
		in = new Scanner(System.in);
		System.out.println("1\t Do While");
		System.out.println("2\t While");
		System.out.println("3\t For");
		System.out.println("Introduce el número del 1bucle quieres usar");
		
		int choice = in.nextInt();
		switch(choice){
		
		case 1: System.out.println("Has elegido utilizar el bucle do while");
		DoWhileAlphabet doWhile = new DoWhileAlphabet();
		doWhile.useDoWhile();
		return;
		
		case 2: System.out.println("Has elegido utilizar el bucle while");
		WhileAlphabet whileAlphabet = new WhileAlphabet();
		whileAlphabet.useWhile();
		return;
		
		case 3: System.out.println("Has elegido utilizar el bucle for");
		ForAlphabet forAlphabet = new ForAlphabet();
		forAlphabet.useFor();
		
		return; 
		default: System.out.println("Opción incorrecta");
		}
	}
}
