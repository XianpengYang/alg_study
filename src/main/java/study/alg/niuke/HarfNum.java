package study.alg.niuke;

import java.util.HashMap;
import java.util.Map;

public class HarfNum {


    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 描述
     * 给一个长度为 n 的数组，数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     * 例如输入一个长度为9的数组[1,2,3,2,2,2,5,4,2]。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
     *
     * @param numbers int整型一维数组
     * @return int整型
     */
    public int MoreThanHalfNum_Solution(int[] numbers) {

        Map<Integer, Integer> num_map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (num_map.containsKey(numbers[i])) {
                num_map.put(numbers[i], num_map.get(numbers[i]) + 1);
            } else {
                num_map.put(numbers[i], 1);
            }
            if (num_map.get(numbers[i]) >= numbers.length/2) {
                return numbers[i];
            }
        }

        return -1;
    }


}
