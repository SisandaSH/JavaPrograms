import java.util.Scanner;

public class MassCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Maximum allowed mass
        final double MAX_MASS = 100.0;

        // Variable to store the total mass
        double totalMass = 0.0;

        // Prompt user for input
        System.out.println("Enter the masses of items one by one (enter 0 to stop):");

        // Read masses and calculate total
        while (true) {
            // Input mass
            double mass = scanner.nextDouble();

            // Check for end of input
            if (mass == 0) {
                break;
            }

            // Add mass to total
            totalMass += mass;
        }

        // Display the total mass
        System.out.printf("The total mass is: %.2f kg%n", totalMass);

        // Check if the total mass exceeds the allowed maximum
        if (totalMass > MAX_MASS) {
            System.out.println("Warning: The total mass exceeds the allowed maximum of " + MAX_MASS + " kg.");
        } else {
            System.out.println("The total mass is within the allowed limit.");
        }

        // Close the scanner
        scanner.close();
    }
}
