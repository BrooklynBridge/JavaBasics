import java.util.Scanner;


public class SwitchCase {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int day = scan.nextInt();
		
		System.out.println(ReturnWeekday(day));
				
	}
	
	private static String ReturnWeekday(int day) {
		
		String weekDay = "";
		
		switch (day) {
		case 1: weekDay = "Monday"; break;
		case 2: weekDay = "Tuesday"; break;
		case 3: weekDay = "Wednesday"; break;
		case 4: weekDay = "Thursday"; break;
		case 5: weekDay = "Friday"; break;
		case 6: weekDay = "Saturday"; break;
		case 7: weekDay = "Sunday"; break;
		default: weekDay = "Invalid day!"; break;
		}		
		
		return weekDay;
	}	
	
}
