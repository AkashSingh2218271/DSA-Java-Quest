package ARRAYS_ONE_D;

import java.util.*;

public class _3Sum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue; // Skip duplicate elements
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                /*
                 * approach using set
                 * sum = nums[i] + nums[l] + nums[r];
                 * if (sum == 0) {
                 * set.add(Arrays.asList(nums[i], nums[l], nums[r]));
                 * l++; r--;
                 * } else if (sum < 0) {
                 * l++;
                 * } else {
                 * r--;
                 * }
                 * after the for loop
                 * list.addAll(set);
                 */
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> result = threeSum(arr);
        System.out.println("Unique triplets that sum to zero: " + result);
        sc.close();
    }
}
