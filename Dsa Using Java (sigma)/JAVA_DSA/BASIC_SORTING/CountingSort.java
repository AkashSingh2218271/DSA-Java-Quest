package BASIC_SORTING;

import java.util.Scanner;

public class CountingSort {
    public static void countingSort1(int a[]) {
        int n = a.length;
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
        maxEle = Math.max(maxEle, a[i]);
        int cnt[] = new int[maxEle+1];
        for (int i = 0; i < n; i++) 
        cnt[a[i]]++;
        int j = 0;
        for(int i = maxEle; i >= 0; i--) {
            while(cnt[i] != 0) {
                a[j++] = i;
                cnt[i]--;
            }
        }
    }
    public static void countingSort(int a[]) {
        int n = a.length;
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
        maxEle = Math.max(maxEle, a[i]);
        int cnt[] = new int[maxEle+1];
        for (int i = 0; i < n; i++) 
        cnt[a[i]]++;
        int j = 0;
        for(int i = 0; i <= maxEle; i++) {
            while(cnt[i] != 0) {
                a[j++] = i;
                cnt[i]--;
            }
        }
    }

    public static void printArr(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + ", ");
            }
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
        countingSort(a);
        System.out.print("Array after sorting ");
        printArr(a);
        System.out.print("Array after sorting "); // descending order
        countingSort1(a);
        printArr(a);
    }

}
