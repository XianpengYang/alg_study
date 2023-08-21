package study.alg;

import study.alg.niuke.binarySearch1;

// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
public class Main {
    public static void main(String[] args) {
//        binarySearch1 t1 = new binarySearch1();
//        int r = t1.search(new int[]{},0);
//        System.out.println(r);

        binarySearch1 t2 = new binarySearch1();
        int[][]arr2 = {{1,4,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        boolean r = t2.arraySearch(9,arr2);
        System.out.println(r);


    }
}