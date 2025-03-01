package JAVA_DSA.CONDITIONAL_STATEMENTS;

import java.util.Scanner;

public class WeekDay {
    
    public static void week(int x){
        switch (x) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day.");
                break;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between (1-7) :");
        int wd = sc.nextInt();
        week(wd);
        sc.close();

    }
}
