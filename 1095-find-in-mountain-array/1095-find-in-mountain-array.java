/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int pivot = Peak(mountainArr, 0, n - 1);

        int ind = LRBS(mountainArr, target, 0, pivot, true);
        if(ind != -1){
            return ind;
        }
        return LRBS(mountainArr, target, pivot + 1, n - 1, false);
    }

    int Peak(MountainArray mountainArr, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s)/2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return s;
    }

    int LRBS(MountainArray mountainArr, int target, int s, int e, boolean order) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int midt = mountainArr.get(mid);

            if (midt == target) {
                return mid;
            }

            if (order) {
                if (midt < target) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            } else {
                if (midt > target) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }

        }
        return -1;
    }
}