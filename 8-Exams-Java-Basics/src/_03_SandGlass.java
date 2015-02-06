import java.util.Scanner;


public class _03_SandGlass {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		int dotCount = 0;
		int starCount = n;
		
		while (starCount >= 1) {
			PrintRow(dotCount, starCount);
			dotCount++;
			starCount -= 2;
		}
		dotCount = (n - 3) / 2;
		starCount = 3;
		
		while (dotCount >= 0) {
			PrintRow(dotCount, starCount);
			dotCount--;
			starCount += 2;
		}		
	}

	private static void PrintRow(int dotCount, int starCount) {
		
		for (int i = 0; i < dotCount; i++) {
			System.out.print(".");
		}
		for (int i = 0; i < starCount; i++) {
			System.out.print("*");
		}
		for (int i = 0; i < dotCount; i++) {
			System.out.print(".");
		}
		System.out.println();
	}

}
