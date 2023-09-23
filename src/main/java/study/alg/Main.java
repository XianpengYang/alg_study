package study.alg;

import jdk.jshell.execution.Util;
import study.alg.niuke.AboutString;
import study.alg.niuke.HarfNum;
import study.alg.niuke.StepJumping;
import study.alg.niuke.binarySearch1;
import study.alg.Utils.Array_log;

import static study.alg.Utils.Array_log.arr02;

// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
public class Main {
    public static void main(String[] args) {


//        test_niuke_arraySearch();
//        test_niuke_search();
//        test_niuke_AboutString();
//        test_niuke_HarfNum();
        test_niuke_step();
    }

    public static void test_niuke_arraySearch() {
        binarySearch1 t2 = new binarySearch1();
        boolean r = t2.arraySearch(9, arr02);
        System.out.println(r);

    }

    public static void test_niuke_search() {
        binarySearch1 t1 = new binarySearch1();
        int r = t1.search(new int[]{}, 0);
        System.out.println(r);

    }

    public static void test_niuke_AboutString() {
        String s = "Hello World HHHa";
        AboutString ab = new AboutString();

        String str = ab.trans(s, 16);
        System.out.println(str);


    }

    public static void test_niuke_HarfNum() {
        int[] numbers = {1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 4, 5, 6, 7, 7, 7, 7, 67};
        HarfNum harfNum = new HarfNum();
        int re = harfNum.MoreThanHalfNum_Solution(numbers);
        System.out.println(re);
    }

    public static void test_niuke_step() {
        int number = 40;
        StepJumping s = new StepJumping();
        System.out.println(s.jumpFloor(number));


        int A[] = {1, 2, 3, 0, 0, 0};
        int B[] = {4, 5, 6};
        s.merge(A, 3, B, 3);

        int C[] = {6,5,4,3,2,1};
//        int C[] = {4,4,4};
        s.candy(C);


    }
}