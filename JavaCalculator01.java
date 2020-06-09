
import java.util.Scanner;

public class JavaCalculator01 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("           Loan: ");
        double loan = sc.nextDouble();
        System.out.print("       Interest: ");
        double interest = sc.nextDouble();
        System.out.print("           Term: ");
        double term = sc.nextDouble();

        double tempInterest = interest / 12.0;
        double result = loan * (tempInterest / (1.0 - Math.pow((1.0 + tempInterest), -term)));

        System.out.println("Monthly Payment: " + String.format("%.2f", result));
    }
}

// Single Source File Code example
// runs with java --source 14 --enable-preview JavaCalculator01.java
