import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of term you need of  fibonacci series");
        int term = sc.nextInt();

        int a = 0, b = 1, c = 0;
        for (int i = 0; i < term; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
