package laioffer.class1_array_and_sorting;

/**
 * Created by guangshuo on 3/13/17.
 * separate and combine
 * 1 3 5 7 9 8 6 4 2 0  -- level 0
 * -------separate------
 * 1 3 5 7 9  \  8 6 4 2 0 - level 1
 * 1 3 5|7 9  \  8 6 4\2 0 - level 2
 * 1 3 \ 5                 - level 3
 * 1 \ 3                   - level 4
 * -------combine-------
 * level3 array[]
 *
 *
 * space: O(N)
 * time: O(NlogN)
 */
public class MergeSort {
    public void mergeSort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int[] helper = new int[array.length];
        mergeSort(array, helper, 0, array.length - 1);
        return;
    }
    private void mergeSort(int[] array, int[] h, int l, int r) {
        if (l == r) {
            return;
        }
        int mid = l + (r - l) / 2;
        mergeSort(array, h, l, mid);
        mergeSort(array, h, mid + 1, r);
        combineTwoArray(array, h, l, mid, r);
    }
    private void combineTwoArray(int[] array, int[] h, int start1, int end1, int end2) {
        int start2 = end1 + 1;
        for (int i = start1; i <= end2; i++) {
            h[i] = array[i];
        }
        int leftHIndex = start1;
        int rightHIndex = start2;
        int arrayIndex = start1;
        while (leftHIndex <= end1 && rightHIndex <= end2) {
            if (h[leftHIndex] <= h[rightHIndex]) {
                array[arrayIndex++] = h[leftHIndex++];
            } else {
                array[arrayIndex++] = h[rightHIndex++];
            }
        }
        while (leftHIndex <= end1) {
            array[arrayIndex++] = h[leftHIndex++];
        }
    }

}
