import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class _08_ListOfProducts {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("input.txt"));

        ArrayList<Product> products = new ArrayList<Product>();

        while(scan.hasNextLine()) {
            String[] productsInput = scan.nextLine().split("\\s+");
            products.add(new Product(productsInput[0],Double.parseDouble(productsInput[1])));
        }

        for (int i = 0; i < products.size() - 1; i++) {
            for (int j = i + 1; j < products.size(); j++) {
                if (products.get(i).getPrice() > products.get(j).getPrice()) {
                    Product temp = new Product(products.get(i).getName(), products.get(i).getPrice());
                    products.set(i, products.get(j));
                    products.set(j, temp);

                }

            }

        }
        FileWriter output = new FileWriter("output.txt");
        for (Product product : products) {
            output.write(String.format("%.2f %s\n", product.getPrice(), product.getName()));
        }
        output.close();
        scan.close();

    }
}
