package cn.ianzhang.No0412FizzBuzz;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ian Zhang on 05/12/2016.
 */
public class SolutionTest {
    @Test
    public void fizzBuzz() throws Exception {
        Solution s = new Solution();
      assertEquals("[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]", s.fizzBuzz(15).toString());
    }

}