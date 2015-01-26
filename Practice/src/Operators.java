import java.util.Scanner;


public class Operators {

	public static void main(String[] args) {
		
		String str = "pesho";
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		//enter pesho
		String str2 = scan.nextLine();
		
		//the result is false!
		System.out.println(str == str2); 
		
		//compare strings with str.equals(str2)
		System.out.println(str.equals(str2));
		

	}

}
