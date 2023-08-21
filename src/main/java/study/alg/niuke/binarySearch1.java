package study.alg.niuke;

public class binarySearch1 {
    /**
     * @param nums   int整型一维数组
     * @param target int整型
     * @return int整型
     */
    public int search(int[] nums, int target) {
        int right = nums.length;
        if (right == 0) {
            return -1;
        }
        int left = 0;

        while (right >= left) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;

    }

    public boolean arraySearch(int target, int[][] array) {
        for (int[] ints : array) {
            if (ints.length == 0) {
                return false;
            }
            if (ints[0] <= target && ints[ints.length - 1] >= target) {
                int tar = search(ints, target);
                if (tar != -1) {
                    return true;
                }
            }
        }
        return false;
    }


}
