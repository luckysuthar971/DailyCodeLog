class Solution {
    public int findMin(int[] nums) {
        int peck = SearchForPeck(nums);
        if(peck == nums.length - 1){
            return nums[0];
        }else{
            return nums[peck + 1];
        }
    }

    int SearchForPeck(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if(arr[s] > arr[mid]){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
         return -1;
    }
}