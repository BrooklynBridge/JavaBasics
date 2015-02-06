import java.util.Scanner;

public class _01_SymmetricNumbersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startNumber = scan.nextInt();
        int endNumber = scan.nextInt();

        for (int i = startNumber; i <= endNumber; i++) {
            if (i >= 0 && i <= 9) {
                System.out.print(i + " ");
            }
            if (i >= 11 && i <= 99) {
                if (i % 10 == i / 10) {
                    System.out.print(i + " ");
                }

            }
            if (i >=100 && i <= 999) {
                if (i % 10 == i / 100) {
                    System.out.print(i + " ");
                }
            }

       }
    }
}