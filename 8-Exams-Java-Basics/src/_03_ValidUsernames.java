import java.util.ArrayList;
import java.util.Scanner;


public class _03_ValidUsernames {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		//parse and split the input string
		String[] input = scan.nextLine().trim().replaceAll("\\\\", " ")
				.split("[ /()]+");
		//define a RegEx pattern
		String nameRegEx = "[a-zA-Z]+[a-zA-z0-9_]+";

		//initialize a list to store the valid names
		ArrayList<String> validNames = new ArrayList<String>();	
		//add the valid names to the list
		for (int i = 0; i < input.length; i++) {
			String name = input[i];
			if (name.matches(nameRegEx) && name.length() >= 3
					&& name.length() <= 25) {
				validNames.add(name);
			}
		}		
		
		//check the biggest sum and store the start index
		int maxSum = 0;
		int index = 0;	
		
		for (int i = 0; i < validNames.size() - 1; i++) {
			int length1 = validNames.get(i).length();
			int length2 = validNames.get(i + 1).length();
			int currentSum = length1 + length2;
			
			if (currentSum > maxSum) {
				maxSum = currentSum;
				index = i;
			}
		}		
		//print the result
		System.out.println(validNames.get(index));
		System.out.println(validNames.get(index + 1));
	}
}