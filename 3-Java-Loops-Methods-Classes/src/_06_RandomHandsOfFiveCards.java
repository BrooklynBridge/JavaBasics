import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class _06_RandomHandsOfFiveCards {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		String[] cardFaces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		char[] cardSuits = {'\u2666', '\u2663', '\u2665', '\u2660'};
		
		Random faceGen = new Random();
		Random suitGen = new Random();
		
		ArrayList<String> cards = new ArrayList<String>();
		int n = scan.nextInt();
			
		for (int i = 0; i < n; i++) {
			
			int generatedCards = 0;
			
			while (generatedCards < 5) {
				
				String face = cardFaces[faceGen.nextInt(cardFaces.length)];
				char suit = cardSuits[suitGen.nextInt(cardSuits.length)];
				String card = face + suit;
				
				if (cards.contains(card)) {
					continue;
				}
				
				generatedCards++;
				cards.add(card);									
				System.out.print(card);
				
				if (generatedCards < 5) {
					System.out.print(" ");
				}
			}		
			System.out.println();
		}
		
	}
}
