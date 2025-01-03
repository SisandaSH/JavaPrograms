public class SavingsAccount {
    public static void main(String[] args) {
        // Initial balance
        double balance = 1000.00;

        // Annual interest rate
        double interestRate = 0.045;

        // Annual contribution
        double annualContribution = 500.00;

        // Loop through 18 years
        for (int year = 1; year <= 18; year++) {
            // Add interest to the balance
            balance += balance * interestRate;

            // Add annual contribution
            balance += annualContribution;
        }

        // Display the total balance on Sipho's 18th birthday
        System.out.printf("The total balance on Sipho's 18th birthday is: R%.2f%n", balance);
    }
}
