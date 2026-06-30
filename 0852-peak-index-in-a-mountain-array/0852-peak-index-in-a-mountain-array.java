class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max = 0;
        int ind = 0;
        for(int i = 0;i < arr.length- 1;i++){
            if(max < arr[i]){
                max = arr[i];
                ind = i;
            }
        }
        return ind;
    }
}