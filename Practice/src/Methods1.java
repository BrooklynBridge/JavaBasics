import java.util.Scanner;


public class Methods1 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			PrintAsterix(i);
			System.out.println();
		}
	}

	private static void PrintAsterix(int count) {
		
		for (int i = 0; i < count; i++) {
			System.out.print("*");
		}
		
	}
}
