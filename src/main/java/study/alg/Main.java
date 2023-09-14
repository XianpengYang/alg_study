package study.alg;

import jdk.jshell.execution.Util;
import study.alg.niuke.AboutString;
import study.alg.niuke.binarySearch1;
import study.alg.Utils.Array_log;

import static study.alg.Utils.Array_log.arr02;

// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
public class Main {
    public static void main(String[] args) {


        test_niuke_arraySearch();
        test_niuke_search();
        test_niuke_AboutString();

    }
    public static void test_niuke_arraySearch(){
        binarySearch1 t2 = new binarySearch1();
        boolean r = t2.arraySearch(9, arr02);
        System.out.println(r);

    }
    public static void test_niuke_search(){
        binarySearch1 t1 = new binarySearch1();
        int r = t1.search(new int[]{}, 0);
        System.out.println(r);

    }
    public static void test_niuke_AboutString(){
        String s = "Hello World HHHa";
        AboutString ab = new AboutString();

        String str = ab.trans(s,16);
        System.out.println(str);



    }
}