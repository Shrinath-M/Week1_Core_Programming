import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100. The computer will try to guess it!");

        while (true) {
            guess = generateGuess(lowerBound, upperBound, random);
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct'):");
            feedback = scanner.next().toLowerCase();

            if (feedback.equals("correct")) {
                System.out.println("Hooray! The computer guessed your number correctly!");
                break;
            } else if (feedback.equals("high")) {
                upperBound = guess - 1;
            } else if (feedback.equals("low")) {
                lowerBound = guess + 1;
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }

        scanner.close();
    }

    public static int generateGuess(int lowerBound, int upperBound, Random random) {
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
}
