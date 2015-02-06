import java.util.ArrayList;
import java.util.Scanner;


public class _01_MirrorNumbers {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		//parse the count of numbers in the next line
		int n = scan.nextInt();
		scan.nextLine();
		
		//store them in an integer array
		int[] nums = new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		
		//store the numbers that have been printed in this list
		ArrayList<Integer> printedNums = new ArrayList<>();
		
		//store info if a result has been found
		boolean validResult = false;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				
				//check in order not to print the same pair twice
				if (printedNums.contains(nums[i]) == false && 
						printedNums.contains(nums[j]) == false) {
					
					//the numbers must be different
					if (i != j) {
						
						//check if the mirror digits match
						if ((nums[i] / 1000) % 10 == (nums[j] % 10)) {					
							if ((nums[i] / 100) % 10 == ((nums[j] / 10) % 10)) {
								if ((nums[i] / 10) % 10 == ((nums[j] / 100) % 10)) {
									if (nums[i] % 10 == ((nums[j] / 1000) % 10)) {
										
										//a match has been found
										validResult = true;
										
										//print the result
										System.out.println(nums[i] + "<!>" + nums[j]);
										
										//add the printed numbers to the list
										printedNums.add(nums[i]);
										printedNums.add(nums[j]);
									}
								}
							}
						}
					}
				}			
			}
		}
		
		//check if a result has been found
		if (validResult == false) {
			System.out.println("No");
		}
	}

}
