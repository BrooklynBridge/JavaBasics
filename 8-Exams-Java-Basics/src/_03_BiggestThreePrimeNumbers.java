import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class _03_BiggestThreePrimeNumbers {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		//parse and split the input string
		String[] input = scan.nextLine().split("[\\s+()]");
		
		//initialize an array for storing the found primes
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		//check each number from the input
		for (int i = 0; i < input.length; i++) {
			if (input[i].equals("") == false) {			
				int num= Integer.parseInt(input[i]);
				boolean isPrime = CheckPrime(num);
				//add it to the list if it is prime
				if (isPrime && (primes.contains(num) == false)) {
					primes.add(num);
				}				
			}			
		}
		//sort the list of primes
		Collections.sort(primes);
		
		//print No if less than three primes have been found
		if (primes.size() < 3) {
			System.out.println("No");
		//otherwise print the last three primes from the sorted set
		//because they are the largest
		} else {
			int sum = 0;
			for (int i = (primes.size() - 1); i >= (primes.size() - 3); i--) {
				sum += primes.get(i);
			}
			System.out.println(sum);
		}
		
	}
	//method for checking if an integer is prime
	private static boolean CheckPrime(int num) {
		
		boolean isPrime = true;
		
		if (num <= 1) {
			isPrime = false;
		} else {
			int divisor = 2;
			int maxDivisor = (int)Math.sqrt(num);
			int value = num;
			
			while (divisor <= maxDivisor) {			
				if (value % divisor == 0) {
					isPrime = false;
					break;
				}
				divisor++;
			}
		}		
		return isPrime;		
	}
}