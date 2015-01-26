import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class _08_SumNumbersFromTextFile {

	public static void main(String[] args) {
		
		BufferedReader reader = null;
		long sum = 0;
		
		try {
			
			String currentRow = "";
			
			reader = new BufferedReader(new FileReader("Input.txt"));
			
			while ((currentRow = reader.readLine()) != null ) {
				sum += Integer.parseInt(currentRow);						
			}
			System.out.println(sum);
			
		} catch (IOException ex) {
			System.out.println("Error");
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
