import java.util.Scanner;


public class _03_PrintHometown {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your hometown: ");
		String hometown = scan.next();
		
		System.out.println(hometown);
	}
}