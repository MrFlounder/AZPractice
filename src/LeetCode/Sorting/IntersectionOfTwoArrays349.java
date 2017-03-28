package LeetCode.Sorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by guangshuo on 3/19/17.
 */
public class IntersectionOfTwoArrays349 {
    public int[] intersection(int[] nums1, int[] num2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < num2.length; i++) {
            if (set.contains(num2[i])) {
                if (!result.contains(num2[i])) {
                    result.add(num2[i]);
                }
            }
        }
        int[] ret = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ret[i] = result.get(i);
        }
        return ret;
    }
}
