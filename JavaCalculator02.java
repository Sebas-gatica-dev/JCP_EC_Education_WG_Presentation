
import java.util.Scanner;

public class JavaCalculator02 {

    static double loan;
    static double interest;
    static double term;
    static double result;

    private static void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("           Loan: ");
        loan = sc.nextDouble();
        System.out.print("       Interest: ");
        interest = sc.nextDouble();
        System.out.print("           Term: ");
        term = sc.nextDouble();
    }

    private static void processData() {
        double tempInterest = interest / 12.0;
        result = loan * (tempInterest / (1.0 - Math.pow((1.0 + tempInterest), -term)));
    }

    private static void outputResult() {
        System.out.println("Monthly Payment: " + String.format("%.2f", result));
    }

    public static void main(String[] args) {
        inputData();
        processData();
        outputResult();
    }
}

// Single Source File Code example
// runs with java --source 14 --enable-preview JavaCalculator02.java
