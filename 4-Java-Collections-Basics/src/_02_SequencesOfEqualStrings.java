import java.util.Scanner;


public class _02_SequencesOfEqualStrings {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);		
		String input = scan.nextLine();
		
		String[] elements = input.split(" ");		
		
		for (int i = 0; i < elements.length - 1; i++) {
			
			System.out.print(elements[i] + " ");
			
			if (!elements[i].equals(elements[i + 1])) {
				System.out.println();
			}
			
			if (i == elements.length - 2) {
				System.out.print(elements[elements.length - 1]);
			}
		}
		
		if (elements.length == 1) {
			System.out.println(elements[0]);
		}
	}
}
