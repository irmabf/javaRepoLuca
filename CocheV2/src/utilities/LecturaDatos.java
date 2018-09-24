package utilities;

import java.util.Scanner;

public class LecturaDatos {
	@SuppressWarnings("resource")
	public static String leerString() {
		return new Scanner(System.in).nextLine();
		
	}
	
	public static String leerString(String msg){
		System.out.println(msg);
		return leerString();
	}
	//Recoge el numero entero introducido por teclado
	public static int leerInt(){
		return new Scanner(System.in).nextInt();
	}
	/**
	 * 1. Imprime el mensaje que pasamos por parametro
	 * 2. Utiliza leerInt() para recoger el numero introducido por teclado
	 * **/
	public static int leerInt(String msg){
		System.out.println(msg);
		return leerInt();
	}
}
