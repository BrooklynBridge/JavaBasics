import java.util.Scanner;


public class Exceptions1 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		String input = new Scanner(System.in).nextLine();
		
		try {			
			enterNumber(input);
		
		} catch (NumberFormatException numEx) {			
			System.out.println("Invalid integer number: " + numEx);
		
		} finally {			
			System.out.println("Finally block, always executes!");
		
		}		
		System.out.println("End - does not execute always!");
	}

	private static void enterNumber(String input) {
		int number = Integer.parseInt(input);	
		if (number == 1) {
			throw new NullPointerException();
		}
		System.out.printf("You entered a valid integer number: %d.\n", number);
	}

}
