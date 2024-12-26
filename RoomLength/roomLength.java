import java.util.Scanner;

public class CarpetPriceCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Length of the room
        System.out.print("Enter the length of the room in metres: ");
        double length = scanner.nextDouble();

        // Input: Width of the room
        System.out.print("Enter the width of the room in metres: ");
        double width = scanner.nextDouble();

        // Calculate the area of the room
        double area = length * width;

        // Carpet price per square metre
        double pricePerSquareMetre = 59.50;

        // Calculate the total price
        double totalPrice = area * pricePerSquareMetre;

        // Display the results
        System.out.printf("The area of the room is: %.3f square metres%n", area);
        System.out.printf("The total price of the wall-to-wall carpet is: R%.2f%n", totalPrice);

        // Close the scanner
        scanner.close();
    }
}
