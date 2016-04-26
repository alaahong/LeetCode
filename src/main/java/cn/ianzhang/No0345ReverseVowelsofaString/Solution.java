package cn.ianzhang.No0345ReverseVowelsofaString;

/**
 * Created by Ian Zhang on 26/04/2016.
 */
public class Solution {
    /**
     * Example 1:
     * Given s = "hello", return "holle".
     * <p>
     * Example 2:
     * Given s = "leetcode", return "leotcede".
     *
     * @param s
     * @return
     */
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] arr = s.toCharArray();
        String vowels = "aeiouAEIOU";
        while (i < j) {
            while (i < j && vowels.indexOf(arr[i]) == -1) {
                i++;
            }
            while (i < j && vowels.indexOf(arr[j]) == -1) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return new String(arr);
    }

    private void swap(char[] arr, int i, int j) {
        char c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }
}