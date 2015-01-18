import java.util.Locale;
import java.util.Scanner;


public class _04_SmallestOfThreeNumbers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		double smallest = 0;
		
		if ((a < b) && (a < c)) {
			smallest = a;
		} else if ((b < a) && (b < c)) {
			smallest = b;
		} else if ((c < a) && (c < b)) {
			smallest = c;
		}
		
		//fix result to display 5 (not 5.0), etc
		System.out.println(smallest);
	}
}
