import java.util.Locale;
import java.util.Scanner;


public class _05_DecimalToHexadecimal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ROOT);
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int decimal = scan.nextInt();
		String hexadecimal = Integer.toHexString(decimal);
		
		System.out.println(hexadecimal.toUpperCase());
		
	}
}
