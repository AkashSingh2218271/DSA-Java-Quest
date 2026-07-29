import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();
        int  x = n;
        System.out.println("Enter a digit to count occurrence in " + n + ".");
        int d = sc.nextInt();
        int count = 0;
        while (n != 0) {
            int rem = n % 10;
            if (rem== d) {
                count++;
            }
            n /= 10;
        }
        System.out.println("occurrence of " + d + " in " + x + " is " + count);
    }
}
