import java.util.Scanner;


public class _01_Timespan {

	static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		//convert the times to seconds
		long startSeconds = convertTimeToSeconds();
		long endSeconds = convertTimeToSeconds();
		
		//calculate the difference in seconds
		long timespan = startSeconds - endSeconds;
		
		//calculate difference in hours, minutes and seconds
		int hours = (int)(timespan / 3600);
		int minutes = (int)((timespan % 3600) / 60);
		int seconds = (int)(timespan % 60);
		
		//print the result on the console
		System.out.print(hours + ":");
		if (minutes < 10) {
			System.out.print("0" + minutes + ":");
		} else {
			System.out.print(minutes + ":");
		}
		if (seconds < 10) {
			System.out.print("0" + seconds);
		} else {
			System.out.print(seconds);
		}	
	}
	
	public static long convertTimeToSeconds() {
		String[] input = scan.nextLine().split(":");
		long result = (Long.parseLong(input[0]) * 3600) + 
				(Long.parseLong(input[1]) * 60) + Long.parseLong(input[2]);
		return result;			
	}
}
