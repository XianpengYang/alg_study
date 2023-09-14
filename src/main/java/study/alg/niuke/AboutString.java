package study.alg.niuke;

import java.util.ArrayList;

import static java.lang.Character.*;

public class AboutString {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 描述
     * 对于一个长度为 n 字符串，我们需要对它做一些变形。
     * <p>
     * 首先这个字符串中包含着一些空格，就像"Hello World"一样，然后我们要做的是把这个字符串中由空格隔开的单词反序，同时反转每个字符的大小写。
     * <p>
     * 比如"Hello World"变形后就变成了"wORLD hELLO"。
     *
     * @param s string字符串
     * @param n int整型
     * @return string字符串
     */
    public String trans(String s, int n) {


        String re = "";
        ArrayList<String> _str = new ArrayList<>();
        String[] str = s.split(" ",-1);
        for (int i = 0; i < str.length; i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < str[i].length(); j++) {
                char c = str[i].charAt(j);
                if (isUpperCase(c)) {
                    c = toLowerCase(c);
                    temp.append(c);
                } else {
                    c = toUpperCase(c);
                    temp.append(c);
                }
            }
            _str.add(String.valueOf(temp));
        }

        for (int i = _str.size() - 1; i >= 0; i--) {
            re += _str.get(i);
            if(i!=0){
                re+=" ";
            }

        }


        return re;
    }


}
