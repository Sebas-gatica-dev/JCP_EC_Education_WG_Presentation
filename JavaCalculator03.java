import java.util.Scanner;

public class JavaCalculator03 {

    private LoanRecord inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("           Loan: ");
        double loan = sc.nextDouble();
        System.out.print("       Interest: ");
        double interest = sc.nextDouble();
        System.out.print("           Term: ");
        double term = sc.nextDouble();
        return new LoanRecord(loan, interest, term);
    }

    private double processData(LoanRecord loan) {
        double tempInterest = loan.interest() / 12.0;
        double result = loan.loan() * (tempInterest / (1.0 - Math.pow((1.0 + tempInterest), -loan.term())));
        return result;
    }

    private void outputResult(double result) {
        System.out.println("Monthly Payment: " + String.format("%.2f", result));
    }

    public void perform() {
        var loan = inputData();
        var result = processData(loan);
        outputResult(result);
    }

    public static void main(String[] args) {
        JavaCalculator03 calc = new JavaCalculator03();
        calc.perform();
    }
}

record LoanRecord(double loan, double interest, double term) {}


// Single Source File Code example
// runs with java --source 14 --enable-preview JavaCalculator03.java
