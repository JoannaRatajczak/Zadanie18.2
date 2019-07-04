public class TaxMethods {

    static double countingTax(double income) {
        double tax = 0;

        if (income <= 85528) {
            tax = income * 0.18 - 556.02;

        } else {
            tax = (income - 85528) * 0.32 + 14839.02;
        }

        return Math.floor(tax);
    }


}
