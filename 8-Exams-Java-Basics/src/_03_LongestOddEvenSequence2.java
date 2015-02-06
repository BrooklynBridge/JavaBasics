import java.util.ArrayList;
import java.util.Scanner;


public class _03_LongestOddEvenSequence2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		//parse the input and store the numbers in a list
		String[] input = scan.nextLine().split("[^-0-9]+");
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			if (input[i].equals("") == false) {
				nums.add(Integer.parseInt(input[i]));
			}
		}
		
		//find the longest alternating sequence
		int maxLength = 0;
		int length = 0;
		boolean mustBeOdd = (nums.get(0) % 2 != 0);
		
		for (Integer num : nums) {
			boolean isOdd = (num % 2 != 0);
			if (isOdd == mustBeOdd || num == 0) {
				length++;
			} else {
				mustBeOdd = isOdd;
				length = 1;
			}
			
			mustBeOdd = !mustBeOdd;
			
			if (length > maxLength) {
				maxLength = length;
			}
		}
		System.out.println(maxLength);
	}
}
