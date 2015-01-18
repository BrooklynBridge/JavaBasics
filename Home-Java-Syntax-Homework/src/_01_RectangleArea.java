import java.util.Scanner;


public class _01_RectangleArea {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int area = a * b;
		
		System.out.println(area);
	}
}
