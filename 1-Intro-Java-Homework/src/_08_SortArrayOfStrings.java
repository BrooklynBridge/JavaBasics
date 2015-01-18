import java.util.Arrays;
import java.util.Scanner;

public class _08_SortArrayOfStrings {

	public static void main(String[] args) {
				
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String[] cities = new String[n];
		
		for (int i = 0; i < cities.length; i++) {
			cities[i] = scan.next();
		}
		
		Arrays.sort(cities);
		
		for (String city : cities) {
			System.out.println(city);
		}
	}
}
