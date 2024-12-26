import java.util.Scanner;

public class PlayschoolEligibility {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Child's age
        System.out.print("Enter the child's age: ");
        int childAge = scanner.nextInt();

        // Input: Parent's marital status (single or not)
        System.out.print("Is the parent single? (yes/no): ");
        boolean isSingleParent = scanner.next().equalsIgnoreCase("yes");

        // Input: Parent's annual income
        System.out.print("Enter the parent's annual income: ");
        double annualIncome = scanner.nextDouble();

        // Input: Parent's age
        System.out.print("Enter the parent's age: ");
        int parentAge = scanner.nextInt();

        // Boolean conditions
        boolean isChildAgeValid = (childAge >= 3 && childAge <= 5);
        boolean isIncomeValid = (annualIncome < 60000);
        boolean isParentAgeValid = (parentAge <= 30);

        // Check all conditions
        if (isChildAgeValid && isSingleParent && isIncomeValid && isParentAgeValid) {
            System.out.println("The toddler meets the criteria and is eligible for the playschool.");
        } else {
            System.out.println("The toddler does not meet the criteria for the playschool.");
        }

        // Close the scanner
        scanner.close();
    }
}
