import java.util.*;

class Solution {
    public int[] getConcatenation(int[] nums) {
           int ans [] = new int[nums.length * 2];
        for(int i = 0;i < nums.length * 2; i++){
            ans[i] = nums[i % nums.length];
        }
        return ans;
    }
}

public class Concatenation_of_Array {
    public static void main(String[] args) {

        Solution sol = new Solution();

        // Test Case 1
        int[] nums1 = {1, 2, 1};
        System.out.println(Arrays.toString(sol.getConcatenation(nums1)));

        // Test Case 2
        int[] nums2 = {1, 3, 2, 1};
        System.out.println(Arrays.toString(sol.getConcatenation(nums2)));

        // Test Case 3
        int[] nums3 = {5, 0, 2};
        System.out.println(Arrays.toString(sol.getConcatenation(nums3)));

        // Test Case 4
        int[] nums4 = {7};
        System.out.println(Arrays.toString(sol.getConcatenation(nums4)));

        // Test Case 5
        int[] nums5 = {9, 8, 7, 6};
        System.out.println(Arrays.toString(sol.getConcatenation(nums5)));

        // Test Case 6
        int[] nums6 = {0, 0, 0};
        System.out.println(Arrays.toString(sol.getConcatenation(nums6)));
    }
}