package CONDITIONAL_STATEMENTS;

import java.util.Scanner;

public class Fever {
    
    public static void checkFever(float temp){
        if (temp > 100) {
            System.out.println("You have a fever"); 
        } else if (temp <= 100) {
            System.out.println("You don't have a fever");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your temperature :");
        float temp = sc.nextFloat();
        checkFever(temp);
        sc.close();
    }
}
