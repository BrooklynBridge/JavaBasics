import java.util.Random;
import java.util.Scanner;


public class RandomGenerator {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		Random rnd = new Random();
		
		for (int i = 0; i < n; i++) {
			int randomNumber = 1 + rnd.nextInt(100);
			System.out.print(randomNumber + " ");
		}
	}

}
