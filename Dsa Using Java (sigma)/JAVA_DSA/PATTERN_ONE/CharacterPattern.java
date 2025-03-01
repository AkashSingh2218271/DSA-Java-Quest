package JAVA_DSA.PATTERN_ONE;
import java.util.Scanner;
public class CharacterPattern {

    public static void characterP(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines of character pattern :");
        int n = sc.nextInt();
        characterP(n);
        sc.close();
    }
}
