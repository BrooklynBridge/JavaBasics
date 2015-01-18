import java.util.Locale;
import java.util.Scanner;


public class _07_CountOfBitsOne {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.ROOT);
		
		int num = scan.nextInt();
		
		int value = num;
		int count = 0;
		
		while (value > 0) {
			int bit = value % 2;
			if (bit == 1) {
				count++;
			}
			value /= 2;
		}
		
		System.out.println(count);
	}
}
