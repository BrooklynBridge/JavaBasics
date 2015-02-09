import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_UserLogs {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		Map<String, LinkedHashMap<String, Integer>> log = new TreeMap<>();

		while (true) {
			String command = scan.nextLine();
			if (command.equals("end")) {
				break;
			} else {
				String[] input = command.replaceAll("\\s+", "")
						.replaceAll("IP=", "").replaceAll("message=", " ")
						.replaceAll("user=", " ").split("\\s+");
				String ipAddress = input[0];
				@SuppressWarnings("unused")
				String message = input[1];
				String user = input[2];
				
				if (log.containsKey(user) == false) {
					
					LinkedHashMap<String, Integer> data = new LinkedHashMap<>();
					data.put(ipAddress, 1);
					log.put(user, data);
					
				} else {
					
					LinkedHashMap<String, Integer> data = log.get(user);
					
					if (data.containsKey(ipAddress)) {
						data.put(ipAddress, data.get(ipAddress) + 1);
					} else {
						data.put(ipAddress, 1);
					}
					
					log.put(user, data);					
				}
			}
		}
		
		for (String user : log.keySet()) {
			System.out.println(user + ":");			
			LinkedHashMap<String, Integer> data = log.get(user);
			int count = data.size();
			
			for (String ipAddress : data.keySet()) {
				System.out.print(ipAddress + " => " + data.get(ipAddress));
				count--;
				if (count > 0) {
					System.out.print(", ");
				} else {
					System.out.println(".");
				}
			}
		}

	}

}
