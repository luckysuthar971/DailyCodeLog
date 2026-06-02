import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
         Arrays.sort(nums);
        return nums[nums.length - k];
    }
}

public class KthLargest {
    public static void main(String[] args) {

        Solution sol = new Solution();

        // Test Case 1
        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        System.out.println(sol.findKthLargest(nums1, k1));

        // Test Case 2
        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k2 = 4;
        System.out.println(sol.findKthLargest(nums2, k2));

        // Test Case 3
        int[] nums3 = {1};
        int k3 = 1;
        System.out.println(sol.findKthLargest(nums3, k3));

        // Test Case 4
        int[] nums4 = {7, 10, 4, 3, 20, 15};
        int k4 = 3;
        System.out.println(sol.findKthLargest(nums4, k4));

        // Test Case 5
        int[] nums5 = {-1, -2, -3, -4, -5};
        int k5 = 2;
        System.out.println(sol.findKthLargest(nums5, k5));

        // Test Case 6
        int[] nums6 = {5, 5, 5, 5, 5};
        int k6 = 1;
        System.out.println(sol.findKthLargest(nums6, k6));
    }
}