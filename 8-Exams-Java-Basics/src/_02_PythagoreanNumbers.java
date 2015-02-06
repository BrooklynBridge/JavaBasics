import java.util.Scanner;

public class _02_PythagoreanNumbers {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		// parse the count of integers
		int n = scan.nextInt();
		// store the numbers in an array
		int[] nums = new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}

		// store information if a solution was found
		boolean validSolution = false;

		// go through the combinations
		for (int a = 0; a < nums.length; a++) {
			for (int b = 0; b < nums.length; b++) {
				for (int c = 0; c < nums.length; c++) {

					// a <= b must be valid
					if (nums[a] <= nums[b]) {

						// check for a solution
						boolean pythagoreanNumbers = (nums[a] * nums[a] + nums[b]
								* nums[b]) == (nums[c] * nums[c]);

						if (pythagoreanNumbers) {
							validSolution = true;

							// print the result
							System.out
									.printf("%s*%s + %s*%s = %s*%s", nums[a],
											nums[a], nums[b], nums[b], nums[c],
											nums[c]);
							System.out.println();
						}
					}
				}
			}
		}

		// print No if no solution was found
		if (validSolution == false) {
			System.out.println("No");
		}
	}

}
