import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;


public class _04_CouplesFrequency {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ROOT);
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		//parse input
		String[] input = scan.nextLine().split(" ");
		
		//store the numbers in an integer array
		int[] numbers = new int[input.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(input[i]);
		}
		
		//create a map to store the couples and the number of their appearances
		Map<String, Integer> coupleMap = new LinkedHashMap<String, Integer>();
		
		//go through the number array
		for (int i = 0; i < numbers.length - 1; i++) {
			//assemble a string key for the map
			String couple = "" + numbers[i] + " " + numbers[i + 1];
			
			//if the map contains the key
			if (coupleMap.containsKey(couple)) {
				//add 1 to its value
				int count = 1 + coupleMap.get(couple).intValue();
				coupleMap.put(couple, count);
			//if the key is new, store it in the map with value 1
			} else {
				coupleMap.put(couple, 1);
			}
		}
		
		//total number of occurrences of couples
		double totalCouples = numbers.length - 1;
		
		//print the result
		for (String key : coupleMap.keySet()) {
			//calculate the percent of each occurrence
			double percent = 100 * (coupleMap.get(key).intValue() / totalCouples);
			//display the result in the required format
			String output = String.format("%s -> %.2f", key, percent);
			System.out.println(output + "%");
		}
	}

}
