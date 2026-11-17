class Solution { 
    public int[] searchRange(int[] nums, int target) { 
        int[] ans = {-1, -1}; 
        ans[0] = search(nums, target, true); 
        ans[1] = search(nums, target, false); 
        return ans; 
    } 

    int search(int[] arr, int target, boolean check) { 
        int s = 0; 
        int e = arr.length - 1; 
        int ans = -1; 

        while (s <= e) { 
            int mid = s + (e - s) / 2; 
            if (arr[mid] > target) { 
                e = mid - 1; 
            } else if (arr[mid] < target) { 
                s = mid + 1; 
            } else { 
                ans = mid; 
                if (check) { 
                    e = mid - 1; 
                } else { 
                    s = mid + 1; 
                } 
            } 
        } 
        return ans; 
    } 
}
