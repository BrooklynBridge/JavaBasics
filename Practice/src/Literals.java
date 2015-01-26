
public class Literals {

	public static void main(String[] args) {
		
		int num = 1_200_000;
		System.out.println(num);
		
		long hexNum = 0xFFFF;
		System.out.println(hexNum); //65535
		
		int binaryNum = 0b1111_1111;
		System.out.println(binaryNum); //255
		
		int twoBytes = 0b0000_0001_0000_0001;
		System.out.println(twoBytes);
		
		char ch = '\u00F1';
		System.out.println(ch);

	}

}
