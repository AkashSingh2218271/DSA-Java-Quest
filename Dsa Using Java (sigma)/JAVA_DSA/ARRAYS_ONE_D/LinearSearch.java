package ARRAYS_ONE_D;
import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int []arr, int n, int target) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
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
        int result = linearSearch(arr, n, target);
        if (result != -1) {
            System.out.println(arr[result] + " is present at index " + result);
        } else {
            System.out.println(target + " is not present in array");
        }

        sc.close();
    }
}
