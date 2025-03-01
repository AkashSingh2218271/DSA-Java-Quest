package JAVA_DSA.CONDITIONAL_STATEMENTS;
import java.util.Scanner;
public class IncomeTax {
    public static float TaxCal(float income){
        float tax = 0;
        if (income < 500000) {
            return tax;
        }
        if (income > 500000 && income < 1000000) {
            return tax = income * 0.2f;
        } else {
            return tax = (float) (income * 0.3);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in floating point form :");
        float salary = sc.nextFloat();
        System.out.println("On income " + salary + " tax is " + TaxCal(salary));
        sc.close();
    }
}
