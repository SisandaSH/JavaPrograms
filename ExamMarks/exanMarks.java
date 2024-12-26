import java.util.Scanner;

public class ExamMarks {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create an array to store 25 exam marks
        int[] marks = new int[25];
        
        // Variable to hold the sum of all marks
        int total = 0;
        
        // Input the marks and calculate the total
        System.out.println("Enter 25 exam marks: ");
        for (int i = 0; i < 25; i++) {
            System.out.print("Mark " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total += marks[i]; // Add each mark to the total
        }
        
        // Calculate the average
        double average = total / 25.0;
        System.out.println("\nThe average mark is: " + average);
        
        // Display the marks greater than the average
        System.out.println("\nMarks greater than the average:");
        for (int i = 0; i < 25; i++) {
            if (marks[i] > average) {
                System.out.println(marks[i]);
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
