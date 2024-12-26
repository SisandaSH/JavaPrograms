import java.util.Scanner;

public class ChequeAccount {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the initial balance
        System.out.print("Enter the initial balance: R");
        double balance = scanner.nextDouble();

        // Variable to store the transaction value
        double transaction;

        // Loop for entering transactions until the value is 0
        do {
            // Ask for the transaction (deposit or cheque)
            System.out.print("Enter the transaction (deposit or cheque, 0 to quit): R");
            transaction = scanner.nextDouble();

            // If the transaction is not 0, update the balance and display it
            if (transaction != 0) {
                balance += transaction;
                System.out.printf("New balance: R%.2f\n", balance);
            }

        } while (transaction != 0); // Exit the loop when 0 is entered

        // Close the scanner
        scanner.close();
    }
}
