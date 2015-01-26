import java.util.Scanner;


public class ConsoleInput2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int num1 = Integer.parseInt(scan.nextLine());
		int num2 = Integer.parseInt(scan.nextLine());
		
		String str = scan.nextLine();
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(str);

	}

}
