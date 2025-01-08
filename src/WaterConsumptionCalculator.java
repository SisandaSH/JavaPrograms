public class WaterConsumptionCalculator {
    private static final double FIXED_RATE = 10.00;
    private static final int FREE_UNITS = 20;

    public double calculateAmountPayable(double unitsUsed) {
        double amountPayable;

        if (unitsUsed <= FREE_UNITS) {
            amountPayable = 0.0;
        } else if (unitsUsed <= 40) {
            amountPayable = (unitsUsed - FREE_UNITS) * FIXED_RATE;
        } else if (unitsUsed<= 100) {
            amountPayable = (40 - FREE_UNITS) * FIXED_RATE + (unitsUsed - 40) * (1.5 * FIXED_RATE);
        } else {
            amountPayable = (40 - FREE_UNITS) * FIXED_RATE + (100 - 40) * (1.5 * FIXED_RATE) + (unitsUsed - 100) * (2 * FIXED_RATE);
        }

        return amountPayable;
    }
}
