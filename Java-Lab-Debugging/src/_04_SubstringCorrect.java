import java.util.Scanner;


public class _04_SubstringCorrect {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        int jump = Integer.parseInt(input.nextLine());

        char search = (char)112;
        boolean hasMatch = false;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == search) {
                hasMatch = true;

                int endIndex = jump + i + 1;

                if (endIndex > text.length()) {
                    endIndex = text.length();
                }

                String matchedString = text.substring(i, endIndex);
                System.out.println(matchedString);
                i += jump;
            }
        }

        if (!hasMatch) {
            System.out.println("no");
        }
    }
}
