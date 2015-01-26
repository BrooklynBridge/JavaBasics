import java.util.Locale;
import java.util.Scanner;

public class _05_AngleUnitConverter {

	public static void main(String[] args) {

		Locale.setDefault(Locale.ROOT);
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			
			double number = scan.nextDouble();
			String measure = scan.next();
			
			if (measure.equals("deg")) {
				double radians = DegreesToRadians(number);
				System.out.printf("%.6f rad \n", radians);
			}
			else if (measure.equals("rad")) {
				double degrees = RadiansToDegrees(number);
				System.out.printf("%.6f deg \n", degrees);
			}
		}	
	}

	private static double RadiansToDegrees(double number) {
		double degrees = number * (180 / Math.PI);
		return degrees;
	}

	private static double DegreesToRadians(double number) {
		double radians = number * (Math.PI / 180);
		return radians;
	}
}
