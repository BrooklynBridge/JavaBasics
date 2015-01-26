import java.util.Scanner;


public class BreakOperator {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int value = num;
		
		long factorial = 1;
		while (true) {			
			if (value == 1) {
				break;
			}
			factorial *= value;
			value--;
		}
		
		System.out.printf("%d! = %d", num, factorial);
	}

}
