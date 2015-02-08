import java.util.Scanner;

public class _04_AngleUnitCoverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int value = scan.nextInt();
            String measure = scan.next();
            System.out.printf("%.6f %s%n", converter(value, measure),
                    measure.equals("deg")? "rad" : "deg");

        }

    }
    public static double converter(double a, String s) {
        if(s.equals("deg")) {
            a = Math.toRadians(a);

        }
        if (s.equals("rad")) {
            a = Math.toDegrees(a);
        }
        return a;

    }
}

