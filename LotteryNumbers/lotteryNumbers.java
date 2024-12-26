import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LotteryGenerator {
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random rand = new Random();
        // Use a Set to store unique lottery numbers
        Set<Integer> lotteryNumbers = new HashSet<>();

        // Generate 6 unique random numbers between 1 and 49
        while (lotteryNumbers.size() < 6) {
            int number = rand.nextInt(49) + 1; // Generate a number between 1 and 49
            lotteryNumbers.add(number); // Add the number to the set (duplicates will be ignored)
        }
        // Display the generated lottery numbers
        System.out.println("Your South African Lottery numbers are: ");
        for (int number : lotteryNumbers) {
            System.out.print(number + " ");
        }
    }
}
