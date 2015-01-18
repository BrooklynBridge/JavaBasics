

public class _09_GeneratePDFbyExternalLibrary {

	public static void main(String[] args) {
		
		String[] cardFaces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		char[] cardSuits = {'\u2666', '\u2663', '\u2665', '\u2660'};
		
		for (int face = 0; face < cardFaces.length; face++) {
			for (int suit = 0; suit < cardSuits.length; suit++) {
				
				String card = cardFaces[face] + cardSuits[suit];
				System.out.print(card + " ");
			}
			System.out.println();
		}		
	}
}
