import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_ActivityTracker {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		//parse the count of the input lines
		int n = scan.nextInt();
		scan.nextLine();

		//initialize a map for storing the data
		Map<Integer, TreeMap<String, Integer>> tracker = new TreeMap<>();
		
		for (int i = 0; i < n; i++) {
			//parse and split the input into variables
			String[] input = scan.nextLine().trim().split("\\s+");		
			String[] date = input[0].split("/");
			
			int month = Integer.parseInt(date[1]);		
			String user = input[1];
			int distance = Integer.parseInt(input[2]);
			
			//store the variables in the map
			if (tracker.containsKey(month) == false) {
				TreeMap<String, Integer> data = new TreeMap<>();
				data.put(user, distance);
				tracker.put(month, data);
			} else {
				TreeMap<String, Integer> data = tracker.get(month);
				if (data.containsKey(user)) {
					distance += data.get(user);
				}
				data.put(user, distance);
				tracker.put(month, data);
			}
		}
		//print the result in the required output
		for (Integer month : tracker.keySet()) {
			System.out.print(month + ": ");
			
			TreeMap<String, Integer> data = tracker.get(month);
			int count = data.size();
			
			for (String user : data.keySet()) {
				System.out.print(user + "(" + data.get(user) + ")");
				count--;
				if (count > 0) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
	}
}