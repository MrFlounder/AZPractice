package LeetCode.Sorting;

import java.util.*;

/**
 * Created by guangshuo on 3/19/17.
 * return same values in two number arrays
 * Put everything in array 1 in hashmap<>
 *
 */
public class IntersectionOfTwoArrays350 {
    public int[] getIntersection(int[] nums1, int[] nums2){
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0)
            return new int[]{};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                map.put(nums1[i], 1 + map.get(nums1[i]));
            } else {
                map.put(nums1[i], 1);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                result.add(nums2[i]);
                if (map.get(nums2[i]) <= 1) {
                    map.remove(nums2[i]);
                } else {
                    map.put(nums2[i], map.get(nums2[i]) - 1);
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
