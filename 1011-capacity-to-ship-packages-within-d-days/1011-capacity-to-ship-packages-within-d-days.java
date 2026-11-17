class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int s = 0;
        int e = 0;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > s) {
                s = weights[i];
            }
            e += weights[i];
        }
        int ans = e;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int daycount = 1;
            int sum = 0;
            for(int day : weights){
               if(sum + day > mid){
                daycount++;
                sum = 0;
               }
                sum += day;
            }
            if(daycount <= days){
                ans = mid;
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return ans;
    }
}