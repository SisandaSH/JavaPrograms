//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        OutputHandler output = new OutputHandler();
        InputHandler input = new InputHandler();
        WaterConsumptionCalculator calculator = new WaterConsumptionCalculator();

        double unitsUsed = input.getUnitsUsed();
        double amountPayable = calculator.calculateAmountPayable(unitsUsed);
        output.displayAmountPayable(amountPayable);

    }
}