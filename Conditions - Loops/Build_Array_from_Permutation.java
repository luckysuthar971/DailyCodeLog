import java.util.*;

class Solution {
    public int[] buildArray(int[] nums) {

       for(int i = 0;i < nums.length;i++)
       nums[i] += (1001 * (nums[nums[i]]  % 1001));

       for(int i = 0;i < nums.length; i++)
       nums[i] /= 1001;

       return nums;
    }
}
    

public class Build_Array_from_Permutation {
    public static void main(String[] args) {

        Solution sol = new Solution();

        // Test Case 1
        int[] nums1 = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(sol.buildArray(nums1)));

        // Test Case 2
        int[] nums2 = {5, 0, 1, 2, 3, 4};
        System.out.println(Arrays.toString(sol.buildArray(nums2)));

        // Test Case 3
        int[] nums3 = {0, 1, 2, 3};
        System.out.println(Arrays.toString(sol.buildArray(nums3)));

        // Test Case 4
        int[] nums4 = {2, 0, 1};
        System.out.println(Arrays.toString(sol.buildArray(nums4)));

        // Test Case 5
        int[] nums5 = {1, 0};
        System.out.println(Arrays.toString(sol.buildArray(nums5)));

        // Test Case 6
        int[] nums6 = {4, 2, 0, 1, 3};
        System.out.println(Arrays.toString(sol.buildArray(nums6)));
    }
}