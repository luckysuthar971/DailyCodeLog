class Solution {
    public int splitArray(int[] nums, int k) {
        int s = 0;
        int e = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] > s){
                s = nums[i];
            }
            e += nums[i];
        }
        int ans = e;
        while(s <= e){
            int mid = s + (e - s)/2;
            int kc = 1;
            int tsum = 0;
            for(int num : nums){
                if(tsum + num > mid){
                   tsum = 0;
                    kc++;
                }
                tsum += num;
            }
            if(kc <= k ){
                ans = mid;
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        } 
        return ans;
    }
}