package utils;

import java.util.Scanner;

public class ReadData {
	@SuppressWarnings("resource")
	public static String readString(){
		return new Scanner(System.in).nextLine();
		
	}
	@SuppressWarnings("resource")
	public static int leerInt(){
		return new Scanner(System.in).nextInt();
	}
}
