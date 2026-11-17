class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        
        int peak = findPeak(nums);
        
        int leftSearch = binarySearch(nums, target, 0, peak);
        if (leftSearch != -1) {
            return leftSearch;
        }
        
        return binarySearch(nums, target, peak + 1, nums.length - 1);
    }

    private int findPeak(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        
        while (s < e) {
            int mid = s + (e - s) / 2;
           if(mid < arr.length - 1 && arr[mid] > arr[mid + 1]){
            return mid;
           }
           if(mid > 0 && arr[mid] < arr[mid - 1]){
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

    private int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
