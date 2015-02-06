import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;


public class _12_CardsFrequencies {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.ROOT);
		
		String[] cards = scan.nextLine().split(" ");
		double numberOfCards = cards.length;
		
		Map<String, Integer> uniques = new LinkedHashMap<String, Integer>();

		for (int i = 0; i < cards.length; i++) {
			
			String key = "";
			
			if (cards[i].substring(0, 1).equals("1") == false) {
				key = cards[i].substring(0, 1);
			} else {
				key = cards[i].substring(0, 2);
			}
			
			if (uniques.containsKey(key) == false) {
				uniques.put(key, 1);
			} else {
				int value = uniques.get(key).intValue();
				value ++;
				uniques.put(key, value);
			}
			
		}
		
		for (String key : uniques.keySet()) {
			
			double percentAppearance = (uniques.get(key).intValue() / numberOfCards) * 100;
			String result = String.format("" + key + " -> " + "%.2f", percentAppearance) + "%";
			
			System.out.println(result);
		}
	}

}
