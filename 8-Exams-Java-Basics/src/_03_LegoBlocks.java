import java.util.ArrayList;
import java.util.Scanner;

public class _03_LegoBlocks {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		// parse the number of rows in both arrays
		int n = scan.nextInt();
		scan.nextLine();

		// initialize two lists to store the rows of each array
		ArrayList<ArrayList<Integer>> jaggedArray1 = new ArrayList<>();
		ArrayList<ArrayList<Integer>> jaggedArray2 = new ArrayList<>();

		for (int i = 0; i < n * 2; i++) {
			// trim and split the input string (by whitespace)
			String[] input = scan.nextLine().trim().split("\\s+");

			// initialize a list of integers for each row
			ArrayList<Integer> row = new ArrayList<>();

			if (i < n) {
				// add the rows of the first array in regular order
				for (int j = 0; j < input.length; j++) {
					if (input[j].equals("") == false) {
						row.add(Integer.parseInt(input[j]));
					}
				}
				jaggedArray1.add(row);
			} else {
				// add the rows of the first array in REVERSED order
				for (int j = input.length - 1; j >= 0; j--) {
					if (input[j].equals("") == false) {
						row.add(Integer.parseInt(input[j]));
					}
				}
				jaggedArray2.add(row);
			}
		}

		// check if the arrays are perfectly matched
		// all joined rows must be as long as the first joined row
		int firstRowLength = jaggedArray1.get(0).size()
				+ jaggedArray2.get(0).size();
		boolean perfectlyMatched = true;

		for (int i = 1; i < jaggedArray1.size(); i++) {
			int currentRowLength = jaggedArray1.get(i).size()
					+ jaggedArray2.get(i).size();
			if (currentRowLength != firstRowLength) {
				perfectlyMatched = false;
			}
		}

		// print the result
		if (perfectlyMatched) {

			// initialize a new list for the resulting matched array
			ArrayList<ArrayList<Integer>> matchedArray = new ArrayList<>();

			// assemble the rows of the new array
			for (int i = 0; i < jaggedArray1.size(); i++) {
				// get the rows from each jagged array
				ArrayList<Integer> start = jaggedArray1.get(i);
				ArrayList<Integer> end = jaggedArray2.get(i);
				// add the elements from the second array to each row from the
				// first
				for (int j = 0; j < end.size(); j++) {
					start.add(end.get(j));
				}
				// store the new row in the matched array
				matchedArray.add(start);
			}

			// print the result on the console! 400/400!!!
			for (ArrayList<Integer> arrayList : matchedArray) {
				System.out.println(arrayList);
			}

		} else {
			// count the total number of cells in both arrays
			int cellsCount = 0;

			for (int i = 0; i < jaggedArray1.size(); i++) {
				cellsCount += jaggedArray1.get(i).size()
						+ jaggedArray2.get(i).size();
			}
			// print the result if the arrays are not perfectly matched
			System.out.println("The total number of cells is: " + cellsCount);
		}
	}
}