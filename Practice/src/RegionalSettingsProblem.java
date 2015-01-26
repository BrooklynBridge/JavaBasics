import java.util.Locale;
import java.util.Scanner;


public class RegionalSettingsProblem {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("BG", "BG"));
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		double age = scan.nextDouble();
		System.out.printf("%f\n", age);
		
		//Println PRINTS with . SEPARATOR!!!
		//REGARDLESS OF LOCALE!!!
		System.out.println(age);
		
		

	}

}
