import java.util.Scanner;

public class UniversityDecision {
    public static void main(String[] args) {
        // Create a Scanner for input
        Scanner scanner = new Scanner(System.in);

        // Input: Average mark and holiday earnings
        System.out.print("Enter your daughter's average mark: ");
        int averageMark = scanner.nextInt();
        System.out.print("Enter the amount earned during the holiday job: R");
        double holidayEarnings = scanner.nextDouble();

        // Determine the university and car decision
        String message;

        // Using switch for ranges
        switch (averageMark / 10) {
            case 10: // Marks = 100
            case 9:  // Marks = 90-99
                message = "You can go to any university of your choice and you will get a car.";
                break;

            case 8:  // Marks = 80-89
            case 7:  // Marks = 75-79
                if (holidayEarnings > 5000) {
                    message = "You can go to any university of your choice and you will get a car.";
                } else {
                    message = "You can go to any university of your choice, but you will not get a car.";
                }
                break;

            case 6:  // Marks = 60-74
                message = "You must study at the nearest university.";
                break;

            default: // Marks below 60
                message = "You cannot go to university and will have to consider other alternatives.";
        }

        // Output the result
        System.out.println(message);

        // Close the scanner
        scanner.close();
    }
}
