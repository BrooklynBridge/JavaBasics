import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class _02_PossibleTriangles {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.ROOT);
		
		//check if a solution has been found
		boolean validSolution = false;
		
		while (true) {
			//parse each line
			String input = scan.nextLine().trim();			
			//leave the infinite loop if the command is End
			if (input.equals("End")) {
				break;
			//else process the input
			} else {
				//store the triangle sides in an array
				String[] stringSides = input.split(" ");
				double[] triangleSides = new double[stringSides.length];
				for (int i = 0; i < triangleSides.length; i++) {
					triangleSides[i] = Double.parseDouble(stringSides[i]);
				}
				
				//sort the array in ascending order
				Arrays.sort(triangleSides);
				
				if ((triangleSides[0] + triangleSides[1]) > triangleSides[2]) {
					//update the solution check variable
					validSolution = true;
					//print the result
					String result = String.format("%.2f+%.2f>%.2f", triangleSides[0], triangleSides[1], triangleSides[2]);
					System.out.println(result);
				}		
			}
		}
		
		//print No if no solution was found
		if (validSolution == false) {
			System.out.println("No");
		}
	}

}
