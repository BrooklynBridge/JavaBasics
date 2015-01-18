
public class _03_FullHouse {

	public static void main(String[] args) {
		
		int fullHouseCount = 0;
		
		for (int face1 = 1; face1 <= 13; face1++) {
			for (int face2 = 1; face2 <= 13; face2++) {
				
				if (face1 != face2) {
					
					for (int suit1 = 1; suit1 <= 4; suit1++) {
						for (int suit2 = suit1 + 1; suit2 <= 4; suit2++) {
							for (int suit3 = suit2 + 1; suit3 <= 4; suit3++) {
								for (int suit4 = 1; suit4 <= 4; suit4++) {
									for (int suit5 = suit4 + 1; suit5 <= 4; suit5++) {
										
										fullHouseCount++;
										
										String card1 = "" + ReturnCardFace(face1) + ReturnCardSuit(suit1);
										String card2 = "" + ReturnCardFace(face1) + ReturnCardSuit(suit2);
										String card3 = "" + ReturnCardFace(face1) + ReturnCardSuit(suit3);
										String card4 = "" + ReturnCardFace(face2) + ReturnCardSuit(suit4);
										String card5 = "" + ReturnCardFace(face2) + ReturnCardSuit(suit5);
										
										System.out.println(card1 + card2 + card3 + card4 + card5);
																	
									}						
								}
							}
						}
					}
				}						
			}
		}
		
		System.out.println(fullHouseCount + " full houses");		
	}
	
	public static char ReturnCardSuit(int suit) {
		
		char result = ' ';
		switch (suit) {
		case 1: result = '\u2666';	
			break;
		case 2: result = '\u2663';
			break;
		case 3: result = '\u2665';
			break;
		case 4: result = '\u2660';
			break;
		}			
		return result;
	}

	public static String ReturnCardFace(int face) {

		String result = " ";

		switch (face) {
		case 1:
			result = "2";
			break;
		case 2:
			result = "3";
			break;
		case 3:
			result = "4";
			break;
		case 4:
			result = "5";
			break;
		case 5:
			result = "6";
			break;
		case 6:
			result = "7";
			break;
		case 7:
			result = "8";
			break;
		case 8:
			result = "9";
			break;
		case 9:
			result = "10";
			break;
		case 10:
			result = "J";
			break;
		case 11:
			result = "Q";
			break;
		case 12:
			result = "K";
			break;
		case 13:
			result = "A";
			break;
		}
		return result;
	}
}
