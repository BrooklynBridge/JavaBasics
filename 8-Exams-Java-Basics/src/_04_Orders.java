import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class _04_Orders {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		//read the number of input lines
		int n = scan.nextInt();
		scan.nextLine();
		
		//create a map for storing the data
		Map<String, TreeMap<String, Integer>> products = new LinkedHashMap<>();
		
		//read each input line
		for (int i = 0; i < n; i++) {
			//split each line into variables
			String[] input = scan.nextLine().trim().split("\\s+");			
			String customer = input[0];
			int amount = Integer.parseInt(input[1]);
			String key = input[2];
			
			//add a new product and order for it			
			if (products.containsKey(key) == false) {
				TreeMap<String, Integer> order = new TreeMap<String, Integer>();
				order.put(customer, amount);
				products.put(key, order);
			//update the order for an existing product
			} else {
				TreeMap<String, Integer> order = products.get(key);
				if (order.containsKey(customer)) {
					amount += order.get(customer);
				} 
				order.put(customer, amount);
				products.put(key, order);
			}			
		}
		
		TreeMap<String, Integer> orders = new TreeMap<String, Integer>();
		
		//print the result
		for (String key : products.keySet()) {
			orders = products.get(key);
			System.out.print(key + ": ");
			
			int length = orders.size();
			for (String customer : orders.keySet()) {
				int amount = orders.get(customer);
				String output = customer + " " + amount;
				System.out.print(output);
				
				length--;
				if (length > 0) {
					System.out.print(", ");
				}
			}			
			System.out.println();
		}
	}
}
