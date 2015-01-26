import java.util.Scanner;


public class _02_Generate3LetterWords {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);	
		String input = scan.next();
		
		char[] letters = LettersToCharArray(input);
		
		for (int a = 0; a < letters.length; a++) {
			for (int b = 0; b < letters.length; b++) {
				for (int c = 0; c < letters.length; c++) {
					
					String result = "" + letters[a] + letters[b] + letters[c];
					
					System.out.printf("%s ", result);
				}
			}
		}
	}

	private static char[] LettersToCharArray(String input) {
		int length = input.length();
		char[] letters = new char[length];
		for (int i = 0; i < letters.length; i++) {
			letters[i] = input.charAt(i);
		}
		return letters;
	}
}