import java.util.Scanner;


public class _06_SumTwoNumbers {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int sum = a + b;
		System.out.println(sum);
	}
}
