import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class ForEachLoop2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.ROOT);
		
		int n = scan.nextInt();
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for (int i = 0; i <= n; i++) {
			nums.add(i);
		}
		
		for (Integer integer : nums) {
			System.out.print(integer + " ");
		}

	}

}
