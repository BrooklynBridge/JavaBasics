import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _07_SumNumbersFromTextFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("input.txt"));

        int sum = 0;
        while (scan.hasNextLine()) {
            sum += scan.nextInt();
        }
        System.out.println(sum);

    }
}
