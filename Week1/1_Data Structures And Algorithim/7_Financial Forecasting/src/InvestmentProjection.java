public class InvestmentProjection {
    public static double computeProjectedAmount(double initialAmount, double interestRate, int durationYears) {
        if (durationYears == 0) {
            return initialAmount;
        }
        return computeProjectedAmount(initialAmount * (1 + interestRate), interestRate, durationYears - 1);
    }
}

