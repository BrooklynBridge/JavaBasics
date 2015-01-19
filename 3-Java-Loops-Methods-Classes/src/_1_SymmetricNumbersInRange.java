import java.util.Scanner;


public class _1_SymmetricNumbersInRange {
	
	public static void main (String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		for (int i = start; i <= end; i++) {
			
			if (i <= 9) {
				System.out.print(i + " ");
			}			
			else if ((i <= 99) && (i >= 10)) {
				int firstDigit = i / 10;
				int lastDigit = i % 10;
				
				if (firstDigit == lastDigit) {
					System.out.print(i + " ");
				}
			}
			else if (i > 99) {
				int firstDigit = i / 100;
				int lastDigit = i % 10;
				
				if (firstDigit == lastDigit) {
					System.out.print(i + " ");
				}
			}			
		}				
	}
	
}
