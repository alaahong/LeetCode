package cn.ianzhang.No0242ValidAnagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ian on 2016/1/23.
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        return solutionViaCollection(s, t)  // solution 1
                &&
                solutionViaArray(s, t) // solution 2
                &&
                solutionViaJavaAPI(s, t); // solution 3
    }

    /**
     * resolve as default method
     *
     * @param s
     * @param t
     * @return
     */
    private boolean solutionViaJavaAPI(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return String.valueOf(sArr).equals(String.valueOf(tArr));
    }

    /**
     * resolve as array
     *
     * @param s
     * @param t
     * @return
     */
    private boolean solutionViaArray(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int temp = arr1[((int) s.charAt(i)) - 97];
            arr1[((int) s.charAt(i)) - 97] = temp + 1;
        }
        for (int i = 0; i < t.length(); i++) {
            int temp = arr2[((int) t.charAt(i)) - 97];
            arr2[((int) t.charAt(i)) - 97] = temp + 1;
        }
        return Arrays.equals(arr1, arr2);
    }

    /**
     * resolve as Map
     *
     * @param s
     * @param t
     * @return
     */
    private boolean solutionViaCollection(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        Map<Character, Integer> mapS = getKeyMap(s);
        Map<Character, Integer> mapT = getKeyMap(t);

        return traverseViaKeySet(mapS, mapT) && traverseViaKeySet(mapT, mapS);
    }

    private Map<Character, Integer> getKeyMap(String s) {
        Map<Character, Integer> mapS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!mapS.containsKey(s.charAt(i))) {
                mapS.put(s.charAt(i), 1);
            } else {
                Integer occur = mapS.get(s.charAt(i)) + 1;
                mapS.put(s.charAt(i), occur);
            }
        }
        return mapS;
    }

    private boolean traverseViaKeySet(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        for (Character key : map1.keySet()) {
            if (!map1.get(key).equals(map2.get(key))) {
                return false;
            }
        }
        return true;
    }
}