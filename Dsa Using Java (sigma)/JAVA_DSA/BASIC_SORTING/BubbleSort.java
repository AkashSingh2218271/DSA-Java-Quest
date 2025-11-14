package BASIC_SORTING;

import java.util.Scanner;

public class BubbleSort {
    
    public static void bubbleSort1(int a[]) {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            int swap = 0;
            for (int j = 0; j < n-i-1; j++) {
                if (a[j] < a[j+1]) {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                    swap++;
                }
            }
            if (swap == 0) {
                break;
            }
        }
    }
    public static void bubbleSort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            int swap = 0;
            for (int j = 0; j < n-i-1; j++) {
                if (a[j] > a[j+1]) {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                    swap++;
                }
            }
            if (swap == 0) {
                break;
            }
        }
    }
    public static void printArr(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ ", ");
        }
        System.out.println();
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array ");
        int n = sc.nextInt();
        int []a = new int[n];
        System.out.print("Enter elements in array ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Array before sorting ");
        printArr(a);
        bubbleSort(a);
        System.out.print("Array after sorting ");
        printArr(a);
        System.out.print("Array after sorting "); // descending order
        bubbleSort1(a);
        printArr(a);
    }
}
