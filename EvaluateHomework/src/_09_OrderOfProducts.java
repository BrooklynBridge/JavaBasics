import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class _09_OrderOfProducts {
    public static void main(String[] args) throws IOException{
        Scanner scanProducts = new Scanner(new File("products.txt"));

        ArrayList<Product> products = new ArrayList<Product>();
        while(scanProducts.hasNextLine()) {
            String[] input = scanProducts.nextLine().split("\\s+");
            products.add(new Product(input[0], Double.parseDouble(input[1])));

        }
        scanProducts.close();

        Scanner scanOrder = new Scanner(new File("Order.txt"));
        double totalSum = 0.0;
        while (scanOrder.hasNext()) {
            String[] input = scanOrder.nextLine().split(" ");
            for (Product product : products) {
                if (input[1].equals(product.getName())) {
                    totalSum += product.getPrice() * Double.parseDouble(input[0]);
                }
            }
        }
        scanOrder.close();

        FileWriter write = new FileWriter("Output2.txt");
        write.write(String.format("%.1f", totalSum));
        write.close();

    }
}
