package cn.ianzhang.No0412FizzBuzz;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ian Zhang on 05/12/2016.
 */
public class Solution {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZBUZZ = "FizzBuzz";

    public List<String> fizzBuzz(int n) {
        List<String> result = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 15 == 0) {
                result.add(FIZZBUZZ);
            } else if ((i + 1) % 5 == 0) {
                result.add(BUZZ);
            } else if ((i + 1) % 3 == 0) {
                result.add(FIZZ);
            } else {
                result.add(String.valueOf(i + 1));
            }
        }
        return result;
    }
}