import java.util.Scanner;
import java.util.TreeMap;

public class _04_ActivityTracker {

	public static void main(String[] args) {

		//NOT DONE!!!
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		scan.nextLine();

		int month = 0;
		TreeMap<String, Integer> userActivity = new TreeMap<>();

		for (int i = 0; i < n; i++) {
			String[] input = scan.nextLine().split("\\s+");
			int currentMonth = Integer.parseInt(input[0].substring(3, 5));
			String user = input[1];
			int distance = Integer.parseInt(input[2]);

			if (currentMonth != month) {

				int keysCount = userActivity.keySet().size();
				int count = 0;
				if (month != 0) {
					System.out.printf("%s: ", month);
				}

				for (String key : userActivity.keySet()) {

					String output = String.format("%s(%s)", key, userActivity
							.get(key).intValue());
					System.out.print(output);

					count++;
					if ((count == keysCount) == false) {
						System.out.print(", ");
					}
				}
				System.out.println();
				userActivity.clear();
				month = currentMonth;
			}

			if (userActivity.containsKey(user) == false) {
				userActivity.put(user, distance);
			} else {
				distance += userActivity.get(user).intValue();
				userActivity.put(user, distance);
			}

		}

		int keysCount = userActivity.keySet().size();
		int count = 0;

		System.out.printf("%s: ", month);

		for (String key : userActivity.keySet()) {

			String output = String.format("%s(%s)", key, userActivity.get(key)
					.intValue());
			System.out.print(output);

			count++;
			if ((count == keysCount) == false) {
				System.out.print(", ");
			}
		}

	}

}
