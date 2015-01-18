import java.util.Scanner;


public class _05_DecimalToHexadecimal {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int decimal = scan.nextInt();
		
		String hexadecimal = Integer.toHexString(decimal).toUpperCase();		
		System.out.println(hexadecimal);
	}

}
