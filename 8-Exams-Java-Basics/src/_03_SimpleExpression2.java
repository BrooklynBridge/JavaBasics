import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;


public class _03_SimpleExpression2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ROOT);		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		//parse the input string
		String input = scan.nextLine().replaceAll("\\s+", "");
		
		//split the string to numbers and operators
		String[] stringNums = input.split("[+-]+");
		String[] operators = input.split("[0-9.]+");

		//use BigDecimal for the result for accuracy
		BigDecimal result = new BigDecimal(stringNums[0]);
		
		for (int i = 1; i < stringNums.length; i++) {
			String operator = operators[i];
			//add or subtract depending on the operator
			if (operator.equals("+")) {
				result = result.add(new BigDecimal(stringNums[i]));
			} else {
				result = result.subtract(new BigDecimal(stringNums[i]));
			}
		}
		//print the result
		System.out.println(result.toPlainString());
	}

}
