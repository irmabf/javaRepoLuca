package beans;

public class DoWhileAlphabet {
	public void useDoWhile() {
		char letter = 'a';
		
		do {
			System.out.print(letter);
			letter++;
		}while (letter <= 'z');

	}
}
