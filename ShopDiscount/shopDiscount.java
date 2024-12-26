import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Amount spent
        System.out.print("Enter the amount spent: R");
        double amountSpent = scanner.nextDouble();

        // Variables to store discount percentage and discounted price
        double discountRate = 0.0;
        double discountedPrice;

        // Determine the discount rate based on the amount spent
        if (amountSpent < 50) {
            discountRate = 0.10; // 10%
        } else if (amountSpent < 70) {
            discountRate = 0.20; // 20%
        } else if (amountSpent < 100) {
            discountRate = 0.30; // 30%
        } else if (amountSpent < 200) {
            discountRate = 0.40; // 40%
        } else {
            discountRate = 0.50; // 50%
        }

        // Calculate the discounted price
        discountedPrice = amountSpent - (amountSpent * discountRate);

        // Output the results
        System.out.printf("The discounted price is: R%.2f%n", discountedPrice);

        // Close the scanner
        scanner.close();
    }
}
