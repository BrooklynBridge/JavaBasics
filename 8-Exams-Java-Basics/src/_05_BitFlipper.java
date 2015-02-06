import java.math.BigInteger;
import java.util.Scanner;


public class _05_BitFlipper {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		BigInteger num = new BigInteger(scan.nextLine());
		BigInteger result = num;
		
		for (int pos = 61; pos >= 0; pos--) {
			
			BigInteger threeBits = result.shiftRight(pos).and(new BigInteger("7"));
			if ((threeBits.equals(new BigInteger("7"))) || (threeBits.equals(new BigInteger("0")))) {
				BigInteger mask = new BigInteger("7").shiftLeft(pos);
				result = result.xor(mask);
				pos -= 2;				
			}
		}		
		System.out.println(result);		
	}
}