package ARRAYS_ONE_D;

import java.util.Scanner;

public class BinarySearch {
     public static int binarySearch(int []arr, int n, int target) {
        int s = 0, e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int n = sc.nextInt();
        System.out.print("Enter the element in array ");
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target you want to find in array ");
        int target = sc.nextInt();
        int result = binarySearch(arr, n, target);
        if (result != -1) {
            System.out.println(arr[result] + " is present at index " + result);
        } else {
            System.out.println(target + " is not present in array");
        }

        sc.close();
    }
}
