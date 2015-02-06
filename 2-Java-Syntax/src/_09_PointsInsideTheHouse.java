import java.util.Locale;
import java.util.Scanner;


public class _09_PointsInsideTheHouse {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ROOT);
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		boolean insideA = (x >= 12.5) && (x <= 17.5) && (y >= 8.5) && (y <= 13.5);
		boolean insideB = (x >= 20) && (x <= 22.5) && (y >= 8.5) && (y <= 13.5);
			
		double aX = 12.5;
		double aY = 8.5;
		double bX = 17.5;
		double bY = 3.5;
		
		double position1 = (bX - aX) * (y - aY) - (bY - aY) * (x - aX);
		
		aX = 22.5;
		aY = 8.5;
		
		double position2 = (bX - aX)*(y - aY) - (bY - aY) * (x - aX);
		
		aX = 12.5;
		aY = 8.5;
		bX = 22.5;
		bY = 8.5;
		
		double position3 = (bX - aX)*(y - aY) - (bY - aY) * (x - aX);
		
		boolean insideC = ((position1 >= 0) && (position2 <= 0)) && (position3 <= 0);
		
		boolean inside = insideA || insideB || insideC;
		
		if (inside) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
	}
}
