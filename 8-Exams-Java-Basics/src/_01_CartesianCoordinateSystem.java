import java.util.Locale;
import java.util.Scanner;

public class _01_CartesianCoordinateSystem {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.ROOT);

		double x = scan.nextDouble();
		double y = scan.nextDouble();

		if (x == 0.0 && y == 0.0) {
			System.out.println(0);

		} else if (x == 0.0 && y != 0.0) {
			System.out.println(5);

		} else if (y == 0.0 && x != 0.0) {
			System.out.println(6);

		} else if (x > 0.0 && y > 0.0) {
			System.out.println(1);

		} else if (x < 0.0 && y > 0.0) {
			System.out.println(2);

		} else if (x < 0.0 && y < 0.0) {
			System.out.println(3);

		} else if (x > 0.0 && y < 0.0) {
			System.out.println(4);
		}

	}
}
