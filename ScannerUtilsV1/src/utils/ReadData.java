package utils;

import java.util.Scanner;

public class ReadData {
	
	//Instance variables
	private String inputString;
	private int inputInt;
	
	public String getInputString() {
		return inputString;
	}
	public void setInputString(String inputString) {
		this.inputString = inputString;
	}
	public int getInputInt() {
		return inputInt;
	}
	public void setInputInt(int inputInt) {
		this.inputInt = inputInt;
	}
	
	public static String readString(){
		Scanner input = new Scanner(System.in);
		String theInput = input.nextLine();
		
		return theInput;
	}
	
	public static int readInt(){
		Scanner input = new Scanner(System.in);
		int theInput = input.nextInt();
		
		return theInput;
	}

}
