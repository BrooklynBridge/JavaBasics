import java.util.Scanner;

public class _02_AddingAngles {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		// parse the count of numbers
		int n = scan.nextInt();
		// store them in an integer array
		int[] nums = new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}

		// variable for storing information if a solution was found
		boolean validSolution = false;

		// go through all the combinations of angles
		for (int a = 0; a < nums.length; a++) {
			for (int b = a + 1; b < nums.length; b++) {
				for (int c = b + 1; c < nums.length; c++) {
					// use each angle only once
					if (a != b && a != c && b != c) {

						// sum the degrees of the three angles
						int sum = nums[a] + nums[b] + nums[c];

						// check if they form full circles
						if (sum % 360 == 0) {
							// a solution was found
							validSolution = true;
							// print the result on the console

							System.out.printf("%s + %s + %s = %s degrees",
									nums[a], nums[b], nums[c], sum);
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
