package ExtraBuiltInFunction.list1;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int low = 1, high = 100;
        boolean correct = false;

        while (!correct) {
            int guess = generateGuess(low, high, rand);
            System.out.println("Computer guesses: " + guess);
            String feedback = getFeedback(sc);
            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Computer guessed the number!");
                correct = true;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            }
        }
        sc.close();
    }

    public static int generateGuess(int low, int high, Random rand) {
        return rand.nextInt(high - low + 1) + low;
    }

    public static String getFeedback(Scanner sc) {
        System.out.print("Enter feedback (low/high/correct): ");
        return sc.nextLine();
    }
}
