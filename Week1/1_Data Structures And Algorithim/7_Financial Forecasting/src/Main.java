//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double principal = 9500;
        double annualInterest = 0.07;
        int period = 6;

        double result = InvestmentProjection.computeProjectedAmount(principal, annualInterest, period);
        System.out.printf("Estimated Value after " + period + " years: %.2f", result);
        }
}

