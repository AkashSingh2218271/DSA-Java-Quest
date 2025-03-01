package JAVA_DSA.CONDITIONAL_STATEMENTS;

import java.util.Scanner;

class LeapYear {
    
public static boolean leapYearORNot(int year) {
    /* if (year % 400 == 0) {
        return true;
    } else if (year % 100 == 0 ) {
        return false;
    } else if (year % 4 == 0) {
        return true;
    } */
    if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
        return true;
    }
    return false;
}

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year :");
        int year = sc.nextInt();
        boolean b = leapYearORNot(year);
        if(b){
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        sc.close();
    }
}