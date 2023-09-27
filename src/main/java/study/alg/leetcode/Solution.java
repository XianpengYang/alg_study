package study.alg.leetcode;

public class Solution {

    public int reverse(int x) {

        String str = Integer.toString(x);
        int dex = 1;
        if (str.charAt(0) == '-') {

            dex = -1;
            str = str.substring(1);
        }
        StringBuilder reversed = new StringBuilder();
        reversed.append(str);
        reversed=reversed.reverse();
        str = reversed.toString();

        int s = 0;
        try {
           s = Integer.parseInt(str) * dex;
        }catch (Exception e){
            s = 0;
        }finally {
            return s;
        }







    }

}
