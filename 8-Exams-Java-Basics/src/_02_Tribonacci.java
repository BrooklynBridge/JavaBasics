import java.math.BigDecimal;
import java.util.Scanner;


public class _02_Tribonacci {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		BigDecimal first = new BigDecimal(scan.nextLine());
		BigDecimal second = new BigDecimal(scan.nextLine());
		BigDecimal third = new BigDecimal(scan.nextLine());

		int n = scan.nextInt();
		
		BigDecimal tribonacci = ReturnTribonacci(first, second, third, n);
		System.out.println(tribonacci);
		
	}

	private static BigDecimal ReturnTribonacci(BigDecimal first, BigDecimal second, BigDecimal third, int n) {
		
		if (n == 1) {
			return first;
		} else if (n == 2){
			return second;
		} else if (n == 3) {
			return third;
		} else {		
			BigDecimal tribonacci = BigDecimal.ZERO;
			int element = 4;
			
			while (element <= n) {
				
				tribonacci = first.add(second).add(third);
				first = second;
				second = third;
				third = tribonacci;
				
				element++;
			}	
			
			return tribonacci;
		}
	}

}
