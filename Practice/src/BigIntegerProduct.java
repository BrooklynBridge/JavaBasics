import java.math.BigInteger;
import java.util.Scanner;


public class BigIntegerProduct {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int number = n;
		
		BigInteger product = new BigInteger("1");
//		same as
//		BigInteger product = BigInteger.ONE;
		
		do {
			BigInteger bigNum = new BigInteger("" + number);
			product = product.multiply(bigNum);
			number++;
		} while (number <= m);
		
		System.out.printf("Product[%d...%d] = %s", n, m, product);

	}

}
