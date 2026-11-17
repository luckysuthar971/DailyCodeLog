class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        if(e <= 1){
            return nums[0];
        }

        while(s <= e){
            int mid = s + (e - s) / 2;
            int temp = -1;
            if(mid > 0 && nums[mid] == nums[mid - 1]){
                temp = (mid - 1) % 2;
            }
            else if(mid < nums.length - 1 && nums[mid] == nums[mid + 1]){
                temp = mid % 2;
            }else{
                return nums[mid];
            }
            if(temp == 1){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
         return -1;
    }
}