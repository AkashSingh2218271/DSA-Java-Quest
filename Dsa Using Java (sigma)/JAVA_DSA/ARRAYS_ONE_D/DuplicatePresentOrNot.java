package ARRAYS_ONE_D;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;   
public class DuplicatePresentOrNot {
        public static boolean checkDuplicate(int []arr) {
            Set<Integer> set = new HashSet<>();
            for (int num : arr) {
                if (set.contains(num)) {
                    return true; // Duplicate found
                }
                set.add(num);
            }
            return false; // No duplicates found
        }

        public static void main(String []args) {
            int []arr = {1, 2, 3, 4, 5, 1};
            if (checkDuplicate(arr)) {
                System.out.println("Duplicate is present in the array");
            } else {
                System.out.println("No duplicate is present in the array");
            }
        }
}