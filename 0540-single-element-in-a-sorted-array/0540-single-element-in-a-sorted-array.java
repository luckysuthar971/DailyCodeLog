class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        while(s != e){
           if(nums[s] == nums[s + 1]){
            s += 2;
           }
           if(nums[e] == nums[e - 1]){
            e -= 2;
           }
        }
        return nums[s];
    }
}