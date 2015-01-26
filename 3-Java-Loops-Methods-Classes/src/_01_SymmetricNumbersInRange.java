import java.util.Scanner;


public class _01_SymmetricNumbersInRange {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		for (int i = start; i <= end; i++) {
				
			String num = "" + i;
			int length = num.length();
			boolean symmetric = ((length == 1) || (num.charAt(0) == num.charAt(length - 1)));
			
			if (symmetric) {
				System.out.printf("%s ", num);
			}
		}
	}
}
