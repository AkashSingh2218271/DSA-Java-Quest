package BASIC_SORTING;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort1(int a[]) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int t = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] < t) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = t;
        }
    }
    public static void insertionSort(int a[]) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int t = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > t) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = t;
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
        insertionSort(a);
        System.out.print("Array after sorting ");
        printArr(a);
        System.out.print("Array after sorting "); // descending order
        insertionSort1(a);
        printArr(a);
    }
}
