import java.util.Locale;
import java.util.Scanner;


public class _06_FormattingNumbers {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ROOT);
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		String hexA = Integer.toHexString(a).toUpperCase();
		String binA = Integer.toBinaryString(a);
		
		String printHexA = "|" + String.format("%-10s", hexA);
		
		String printBinA = "|" + String.format("%10s", binA).replace(' ', '0') + "|";
								
		String printB = String.format("% 10.2f|", b);
		
		String printC = String.format("%.3f", c);
		printC = String.format("%-10s", printC) + "|";
		
		System.out.println(printHexA + printBinA + printB + printC);
	}
}
