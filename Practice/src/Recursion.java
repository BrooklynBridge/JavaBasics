import java.util.Scanner;


public class Recursion {

	public static void main(String[] args) {
		

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();		
		long factorial = calcFactorial(n);
		System.out.println(factorial);

	}
	private static long calcFactorial(int n) {
		if (n <= 1) {
			return 1;
		}
		return n * calcFactorial(n - 1);
	}

}
