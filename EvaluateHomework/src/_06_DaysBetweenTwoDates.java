import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class _06_DaysBetweenTwoDates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String startDate = scan.nextLine();
        String endDate = scan.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date start = sdf.parse(startDate);
            Date end = sdf.parse(endDate);
            // getTime returns milliseconds so i divide it with the double
            long diff = Math.round((end.getTime() - start.getTime()) / (double) 86400000);
            System.out.println(diff);

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
