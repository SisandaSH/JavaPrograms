import java.util.Scanner;

public class PackagingCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Number of items
        System.out.print("Enter the number of items: ");
        int totalItems = scanner.nextInt();

        // Input: Number of items per box
        System.out.print("Enter the number of items that fit in a box: ");
        int itemsPerBox = scanner.nextInt();

        // Calculate the number of boxes needed
        int boxesNeeded = totalItems / itemsPerBox;

        // Calculate the number of leftover items
        int leftoverItems = totalItems % itemsPerBox;

        // Output the results
        System.out.println("Number of boxes needed: " + boxesNeeded);
        System.out.println("Number of leftover items: " + leftoverItems);

        // Close the scanner
        scanner.close();
    }
}
