import java.util.ArrayList;
import java.util.Scanner;


public class _01_GandalfStash {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		//parse the starting mood
		int mood = scan.nextInt();
		scan.nextLine();
		//parse the foods and split them
		String[] input = scan.nextLine().trim().toLowerCase().split("[^a-zA-Z]+");
		
		//add them to a list
		ArrayList<String> foods = new ArrayList<String>();
		for (int i = 0; i < input.length; i++) {
			if (input[i].equals("") == false) {
				foods.add(input[i]);
			}
		}
		
		//add the happiness from each food to the starting value
		for (String food : foods) {
			mood += returnHappiness(food);
		}
		
		//print the result
		System.out.println(mood);		
		System.out.println(returnMood(mood));
		
	}

	private static String returnMood(int mood) {

		if (mood < -5) {
			return "Angry";
		} else if (mood >= -5 && mood < 0){
			return "Sad";
		} else if (mood >= 0 && mood < 15) {
			return "Happy";
		} else {
			return "Special JavaScript mood";
		}
	}

	private static int returnHappiness(String food) {
		int happiness = 0;
		switch (food) {
			case "cram": happiness = 2; break;
			case "lembas": happiness = 3; break;
			case "apple": happiness = 1; break;
			case "melon": happiness = 1; break;
			case "honeycake": happiness = 5; break;
			case "mushrooms": happiness = -10; break;
			default: happiness = -1; break;
		}	
		return happiness;
	}

}
