import java.util.Scanner;

public class WaterConsumptionCalculator {
    public static void main(String[] args) {
        // Constants
        final double FIXED_RATE = 10.0;
        final int FREE_UNITS = 20;

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Number of units of water used
        System.out.print("Enter the number of units of water used: ");
        double unitsUsed = scanner.nextDouble();

        // Variable to store the total amount payable
        double amountPayable = 0.0;

        // Calculate the amount payable
        if (unitsUsed <= FREE_UNITS) {
            // First 20 units are free
            amountPayable = 0.0;
        } else if (unitsUsed <= 40) {
            // Fixed rate for additional units up to 40
            amountPayable = (unitsUsed - FREE_UNITS) * FIXED_RATE;
        } else if (unitsUsed <= 100) {
            // 1.5 times the fixed rate for additional units above 40 and up to 100
            amountPayable = (40 - FREE_UNITS) * FIXED_RATE + (unitsUsed - 40) * (1.5 * FIXED_RATE);
        } else {
            // 2 times the fixed rate for additional units above 100
            amountPayable = (40 - FREE_UNITS) * FIXED_RATE +
                            (100 - 40) * (1.5 * FIXED_RATE) +
                            (unitsUsed - 100) * (2 * FIXED_RATE);
        }

        // Display the amount payable
        System.out.printf("The total amount payable is: R%.2f%n", amountPayable);

        // Close the scanner
        scanner.close();
    }
}
