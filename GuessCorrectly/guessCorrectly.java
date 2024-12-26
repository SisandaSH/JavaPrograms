import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Constant for the secret number
        final int SECRET = 23; // You can set this to any number between 1 and 100

        // Variables
        boolean found = false; // Tracks if the user has guessed the number correctly
        int attempts = 0; // Tracks the number of guesses

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have 10 chances to guess the secret number between 1 and 100.");

        // Loop for 10 chances
        while (attempts < 10 && !found) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++; // Increment the attempts counter

            // Check the guess
            if (guess == SECRET) {
                found = true; // User guessed the number correctly
            } else if (guess < SECRET) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        // Display the result
        if (found) {
            System.out.println("Well done! You got the number in " + attempts + " guesses.");
        } else {
            System.out.println("Tough luck! Your 10 chances are over.");
        }

        // Close the scanner
        scanner.close();
    }
}
