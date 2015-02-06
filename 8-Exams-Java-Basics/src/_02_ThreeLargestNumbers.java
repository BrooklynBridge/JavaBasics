import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class _02_ThreeLargestNumbers {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ROOT);
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		//parse the number of integers 
		int n = scan.nextInt();
		scan.nextLine();
		
		//create a BigDecimal array to store the numbers
		BigDecimal[] nums = new BigDecimal[n];
		for (int i = 0; i < nums.length; i++) {
			String input = scan.nextLine();
			nums[i] = new BigDecimal(input);
		}
		//sort the array in ascending order
		Arrays.sort(nums);
		
		//print the three biggest numbers
		for (int i = nums.length - 1; i >= nums.length - 3; i--) {
			//if the array is less than three numbers
			if (i < 0) {
				//exit the loop to avoid getting an exception
				break;
			}
			//print the number on the console
			System.out.println(nums[i].toPlainString());
		}
	}

}
