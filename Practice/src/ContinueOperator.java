import java.util.Scanner;


public class ContinueOperator {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		long sum = 0;
		
		for (int i = 1; i <= n; i++) {
			if (i % 7 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("sum = " + sum);
	}

}
