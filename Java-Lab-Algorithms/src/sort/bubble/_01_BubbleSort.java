package sort.bubble;

import java.util.ArrayList;
import java.util.Scanner;

//import org.apache.commons.lang.time.StopWatch;

public class _01_BubbleSort {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String[] numbers = scan.nextLine().replace("[", "").replace("]", "").trim()
				.split(", ");
		ArrayList<Integer> numbersArr = new ArrayList<Integer>();

		for (int i = 0; i < numbers.length; i++) {
			numbersArr.add(Integer.parseInt(numbers[i]));
		}

		//StopWatch stopWatch = new StopWatch();
		//stopWatch.start();
		boolean swapped;
		do {
			swapped = false;
			for (int i = 0; i < numbersArr.size() - 1; i++) {
				int num1 = numbersArr.get(i);
				int num2 = numbersArr.get(i + 1);

				if (num1 > num2) {
					numbersArr.set(i, num2);
					numbersArr.set(i + 1, num1);
					swapped = true;
				}
			}

		} while (swapped);

		//stopWatch.stop();
		//long time = stopWatch.getTime();

		System.out.println(numbersArr);
		//System.out.println(time/1000.0);
	}
}