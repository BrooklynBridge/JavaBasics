import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;


public class _03_SimpleExpression {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ROOT);
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine().replaceAll("\\s+", "");
		
		String[] numbers = input.split("[+-]");
		String[] operators = input.split("[0-9.]+");
		
		BigDecimal result = new BigDecimal(numbers[0]);
		
		for (int i = 1; i < numbers.length; i++) {
			BigDecimal num = new BigDecimal(numbers[i]);		
			
			String sign = operators[i];
			
			if (sign.equals("+")) {
				result = result.add(num);
			} else {
				result = result.subtract(num);
			}
		}	
		System.out.println(result);
	}

}
