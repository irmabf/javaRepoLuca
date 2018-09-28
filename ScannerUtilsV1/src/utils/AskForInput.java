package utils;

public class AskForInput {
	public void askForString(){
		System.out.println("Please enter your input as a String");
		
		ReadData readData = new ReadData();
		
		String stringInserted = ReadData.readString();
		
		readData.setInputString(stringInserted);
		
		System.out.println("The input was: " + readData.getInputString());
	} 
	
	public void askForInt(){
		System.out.println("Please, enter your age");
		
		ReadData readData = new ReadData();
		
		int intInserted = readData.readInt();
		
		readData.setInputInt(intInserted);
		
		System.out.println("The numeric input was: " + readData.getInputInt());
	}
}
