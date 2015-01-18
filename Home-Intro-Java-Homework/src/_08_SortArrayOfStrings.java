import java.util.Arrays;
import java.util.Scanner;


public class _08_SortArrayOfStrings {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		String[] cities = new String[count];
		
		for (int i = 0; i < count; i++) {
			
			cities[i] = scan.next();
		}
		
		Arrays.sort(cities);
		
		for (String city : cities) {
			System.out.println(city);
		}
	}
}
