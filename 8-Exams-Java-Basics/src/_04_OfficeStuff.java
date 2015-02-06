import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class _04_OfficeStuff {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		//parse the number of input lines
		int n = scan.nextInt();
		scan.nextLine();
		
		//initialize a map for the data
		Map<String, LinkedHashMap<String, Integer>> stuff = new TreeMap<>();
		
		for (int i = 0; i < n; i++) {
			//parse each line and split it into variables
			String[] input = scan.nextLine().replaceAll("[|-]+", "").split("\\s+");
			
			String company = input[0];
			int amount = Integer.parseInt(input[1]);
			String product = input[2];
			
			//store the variables in the map
			if (stuff.containsKey(company) == false) {
				LinkedHashMap<String, Integer> data = new LinkedHashMap<>();
				data.put(product, amount);
				stuff.put(company, data);
			} else {
				LinkedHashMap<String, Integer> data = stuff.get(company);
				if (data.containsKey(product)) {
					amount += data.get(product);
				}
				data.put(product, amount);
				stuff.put(company, data);
			}			
		}
		
		//print the result in the required format
		for (String company : stuff.keySet()) {
			System.out.print(company + ": ");
			
			LinkedHashMap<String, Integer> data = stuff.get(company);
			int count = data.size();
			
			for (String item : data.keySet()) {
				System.out.print(item + "-" + data.get(item));
				count--;
				if (count > 0) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
	}

}
