import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class _10_OrderOfProducts {

	public static void main(String[] args) {

		Locale.setDefault(Locale.ROOT);

		BufferedReader reader = null;
		BufferedWriter writer = null;

		ArrayList<Product> productList = new ArrayList<Product>();

		try {
			String currentRow = "";

			reader = new BufferedReader(new FileReader("Products.txt"));

			while ((currentRow = reader.readLine()) != null) {

				String[] row = currentRow.split(" ");
				String name = row[0];
				double price = Double.parseDouble(row[1]);

				Product newProduct = new Product(name, price);
				productList.add(newProduct);
			}
			reader.close();
			
			double totalPrice = 0;
			reader = new BufferedReader(new FileReader("Order.txt"));
			
			while ((currentRow = reader.readLine()) != null) {
				String[] row = currentRow.split(" ");
				double quantity = Double.parseDouble(row[0]);
				String requestedProduct = row[1];
				
				for (Product product : productList) {
					if (product.getName().equals(requestedProduct)) {
						totalPrice += (quantity * product.getPrice());
					}
				}						
			}
			reader.close();
			
			String result = String.format("%.1f", totalPrice);
			
			writer = new BufferedWriter(new FileWriter("Output.txt"));
			writer.write(result);
			writer.close();

		} catch (IOException ex) {
			System.out.println("Error" + ex);

		}
	}
	
}