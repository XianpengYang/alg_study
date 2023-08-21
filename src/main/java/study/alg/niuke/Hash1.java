package study.alg.niuke;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hash1 {


    public int[] twoSum(int[] numbers, int target) {
        // write code here
        int[] ret = new int[2];
        Map<Integer, Integer> nums = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int tar = target - numbers[i];
            if (nums.get(tar) != null) {
                ret[0] = i + 1;
                ret[1] = nums.get(tar) + 1;
                Arrays.sort(ret);
                return ret;
            }
            nums.put(numbers[i], i);


        }
        return ret;


    }
}
