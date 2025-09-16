package CONDITIONAL_STATEMENTS;
import java.util.Scanner;

public class OddEven {
    public static void OddAndEven(int x){
        if (x % 2 == 0) {
            System.out.println(x + " is even.");
        }
        else
        {
            System.out.println(x + " is odd.");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pne integer number :");
        int x = sc.nextInt();
        OddAndEven(x);
        sc.close();
    }
}
