package study.alg.niuke;

import java.util.*;

public class StepJumping {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param number int整型
     * @return int整型
     */
    public int jumpFloor(int number) {

        ArrayList<Integer> step = new ArrayList<>();
        if (number == 1) {
            return 1;
        } else if (number == 2) {
            return 2;
        }

        step.add(0);
        step.add(1);
        step.add(2);

        for (int i = 3; i <= number; i++) {
            step.add(step.get(i - 1) + step.get(i - 2));
        }
        return step.get(number);


        // write code here
    }

    public void merge(int A[], int m, int B[], int n) {

        ArrayList<Integer> set = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            set.add(A[i]);
        }
        for (int i = 0; i < n; i++) {
            set.add(B[i]);
        }

        Collections.sort(set);
        ;
        for (int i = 0; i < m + n; i++) {
            A[i] = set.get(i);
        }
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * <p>
     * pick candy
     *
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int candy(int[] arr) {
        // write code here
        int num = arr.length;
//        Arrays.sort(arr);
        ArrayList<Integer> candy = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            candy.add(1);
        }

        for (int i = 1; i < num; i++) {
            if (arr[i] > arr[i - 1]) {
                candy.set(i, candy.get(i - 1) + 1);
            }

        }
//        for (int i = num - 2; i >= 0; i--) {
//            if (candy.get(i) <= candy.get(i + 1) && arr[i] > arr[i + 1]) {
//                int max = candy.get(i + 1) + 1;
//                candy.set(i, max);
//            }
//
//        }


        int sum = 0;
        for (int i :
                candy) {
            sum += i;
            System.out.print(i + ",");
        }
        System.out.println("");
        System.out.println(sum);


        return sum;
    }


}
