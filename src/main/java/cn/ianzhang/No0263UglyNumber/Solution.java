package cn.ianzhang.No0263UglyNumber;

/**
 * Created by Ian on 2016/1/28.
 */
public class Solution {
    public boolean isUgly(int num) {
        int n = num;
        if(n <= 0){
            return false;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        while (n % 5 == 0) {
            n = n / 5;
        }
        return n == 1 || n == 2 || n == 3 || n == 5;
    }
}
