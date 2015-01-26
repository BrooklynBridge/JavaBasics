import java.util.Scanner;


public class Methods2 {

	public static void main(String[] args) {
		
		calcAndPrintRectangleArea();

	}

	private static void calcAndPrintRectangleArea() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		
		System.out.println(calcRectangleArea(a, b));
	}
	
	public static double calcRectangleArea(double a, double b) {
		return a * b;
	}

}
