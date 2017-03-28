package LeetCode.Sorting;

/**
 * Created by guangshuo on 3/21/17.
 * rule:
 *  For odd numbers: n[i-1] <= n[i]
 *      even  numbers: n[i-i] >= n[i]
 * So loop through, when even, if n[i-1] > n[i] swap
 *                  when odd, if ... swap
 * Loop starting at i = 1(second element)
 *
 * Happy path: 3 5 2 1 6 4
 * Expecting:  1 6 2 5 3 4
 */
public class WiggleSort280 {
    public void wiggleSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        int i = 1;
        while (i < nums.length) {
            if (i % 2 != 0) {
                if (nums[i - 1] > nums[i]) {
                    swap(nums, i - 1, i);
                }
            } else {
                if (nums[i - 1] < nums[i]) {
                    swap(nums, i - 1, i);
                }
            }
            i++;
        }
    }
    public void swap(int[] array, int p1, int p2) {
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }
}
