
public class Objects {

	public static void main(String[] args) {
		
		Object dataContainter = 5;
		System.out.println(dataContainter);
		
		dataContainter = "Five";
		System.out.println(dataContainter);
		
		String str = (String)dataContainter;
		dataContainter = dataContainter.toString();
		
		System.out.println(str);
	}
}
