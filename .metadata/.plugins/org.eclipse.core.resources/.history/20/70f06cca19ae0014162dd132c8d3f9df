import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class _05_RandomHandsOf5Cards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        char[] suits = {'♠', '♥', '♦', '♣'};
        String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        Random generator = new Random();


        for (int i = 0; i < n; i++) {
            ArrayList<String> hands = new ArrayList<String>();
            for (int j = 0; j < 5; j++) {
                String current = "";
                int face = generator.nextInt(13);
                int suit = generator.nextInt(4);
                current += faces[face] + suits[suit];
                if (!hands.contains(current)) {
                    hands.add(current);
                }
                else{
                    j--;
                }

            }
            for(String hand:hands) {
                System.out.print(hand + " ");

            }
            System.out.println();
        }
    }
}
