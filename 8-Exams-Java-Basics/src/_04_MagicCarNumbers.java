import java.util.Scanner;


public class _04_MagicCarNumbers {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int magicWeight = scan.nextInt();

		char[] letters = { 'A', 'B', 'C', 'E', 'H', 'K', 'M', 'P', 'T', 'X' };

		int magicNumbersCount = 0;

		for (int a = 0; a <= 9; a++) {
			for (int b = 0; b <= 9; b++) {
				for (int c = 0; c <= 9; c++) {
					for (int d = 0; d <= 9; d++) {

						boolean validNumberFormat = ValidFormat(a, b, c, d);

						if (validNumberFormat) {
							for (int e = 0; e < letters.length; e++) {
								for (int f = 0; f < letters.length; f++) {

									String carNumber = "CA" + a + b + c + d
											+ letters[e] + letters[f];
									int weight = CalcWeight(carNumber);

									if (weight == magicWeight) {
										magicNumbersCount++;

									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(magicNumbersCount);
	}

	private static boolean ValidFormat(int a, int b, int c, int d) {		
		boolean valid = false;		
		if ((a == b && b == c && c == d) || (a != b && b == c && c == d) || 
				(a == b && b == c && c != d) || (a == b && b != c && c == d) ||
				(a == c && b == d && a != b) || (a == d && b == c && a != b)) {
			valid = true;		
		}
		return valid;
	}

	private static int CalcWeight(String carNumber) {
		int weight = 0;
		for (int i = 0; i < carNumber.length(); i++) {
			weight += ReturnCharWeight(carNumber.charAt(i));			
		}
		return weight;
	}

	private static int ReturnCharWeight(char character) {
		int weight = 0;
		
		switch (character) {
			case 'A': weight = 10; break;
			case 'B': weight = 20; break;
			case 'C': weight = 30; break;
			case 'E': weight = 50; break;
			case 'H': weight = 80; break;
			case 'K': weight = 110; break;
			case 'M': weight = 130; break;
			case 'P': weight = 160; break;
			case 'T': weight = 200; break;
			case 'X': weight = 240; break;	
			case '0': weight = 0; break;
			case '1': weight = 1; break;
			case '2': weight = 2; break;
			case '3': weight = 3; break;
			case '4': weight = 4; break;
			case '5': weight = 5; break;
			case '6': weight = 6; break;
			case '7': weight = 7; break;
			case '8': weight = 8; break;
			case '9': weight = 9; break;
		}
		return weight;
	}

}
