/**
 * Use Java 17 or greater
 * @author omniprof
 */
import java.util.Scanner;

public class JavaCalculator03 {

    private LoanRecord inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("           Loan: ");
        var loan = sc.nextDouble();
        System.out.print("       Interest: ");
        var interest = sc.nextDouble();
        System.out.print("           Term: ");
        var term = sc.nextDouble();
        return new LoanRecord(loan, interest, term);
    }

    private double processData(LoanRecord loan) {
        var tempInterest = loan.interest() / 12.0;
        var result = loan.loan() * (tempInterest / (1.0 - Math.pow((1.0 + tempInterest), -loan.term())));
        return result;
    }

    private void outputResult(double result) {
        System.out.printf("Monthly Payment: %.2f%n", result);
    }

    public void perform() {
        var loan = inputData();
        var result = processData(loan);
        outputResult(result);
    }

    public static void main(String[] args) {
        var calc = new JavaCalculator03();
        calc.perform();
    }
}

record LoanRecord(double loan, double interest, double term) {}

