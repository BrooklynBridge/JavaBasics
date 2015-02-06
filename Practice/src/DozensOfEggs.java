import java.util.Scanner;

public class DozensOfEggs {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		// the total amount of eggs
		int eggsCount = 0;

		// read the 7 lines of input
		for (int i = 0; i < 7; i++) {
			// split the input string to amount and measure
			String[] input = scan.nextLine().split(" ");
			int amount = Integer.parseInt(input[0]);
			String measure = input[1];

			// add the eggs to the total amount
			if (measure.equals("dozens")) {
				eggsCount += 12 * amount;
			} else {
				eggsCount += amount;
			}
		}

		// calculate the dozens and eggs
		int dozens = eggsCount / 12;
		int eggs = eggsCount % 12;

		// print the result on the console
		System.out.printf("%s dozens + %s eggs", dozens, eggs);
	}

}
