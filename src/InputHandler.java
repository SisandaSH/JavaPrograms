import java.util.Scanner;

public class InputHandler {
    Scanner sc = new Scanner(System.in);

    public double getUnitsUsed() {
        System.out.println("Enter the number of water units used");
        double unitsUsed = sc.nextDouble();
        sc.close();
        return unitsUsed;
    }
}
