import java.util.Scanner;


public class _03_LargestThreeRectangles {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split("\\D+");
		
		int[] sides = new int[input.length - 1];
		for (int i = 0; i < sides.length; i++) {
			sides[i] = Integer.parseInt(input[i + 1]);
		}
		
		int[] rectangles = new int[sides.length / 2];
		int index = 0;
		
		for (int i = 0; i < rectangles.length; i++) {
			rectangles[i] = sides[index] * sides[index + 1];
			index += 2;
		}
		
		int totalAreaMax = Integer.MIN_VALUE;
		int totalArea = 0;
		
		for (int i = 0; i < rectangles.length - 2; i++) {
			totalArea = rectangles[i] + rectangles[i + 1] + rectangles[i + 2];
			if (totalArea > totalAreaMax) {
				totalAreaMax = totalArea;
			}
		}
		
		System.out.println(totalAreaMax);		
	}

}
