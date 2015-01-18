import java.util.ArrayList;
import java.util.Scanner;


public class _09_CombineListsOfLetters {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		String text1 = scan.nextLine();
		String text2 = scan.nextLine();
		
		ArrayList<Character> letters1 = new ArrayList<>();
		ArrayList<Character> letters2 = new ArrayList<>();
		
		ArrayList<Character> letters1Copy = new ArrayList<>();
		
		for (int i = 0; i < text1.length(); i++) {
			
			if (text1.charAt(i) != ' ') {
				letters1.add(text1.charAt(i));
				letters1Copy.add(text1.charAt(i));
			}			
		}
	
		for (int i = 0; i < text2.length(); i++) {
			
			if (text2.charAt(i) != ' ') {
				letters2.add(text2.charAt(i));
			}		
		}
		
		for (int i = 0; i < letters2.size(); i++) {
			
			char character = letters2.get(i);
			
			if (!letters1Copy.contains(character)) {
				letters1.add(character);
			}
		}
		
		for (int i = 0; i < letters1.size(); i++) {
			
			System.out.print(letters1.get(i));
			
			if (i < letters1.size() - 1) {
				System.out.print(" ");
			}
		}
	}

}
