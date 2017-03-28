package laioffer.class1_array_and_sorting;

/**
 * Created by guangshuo on 3/21/17.
 */
public class MergeSortWithChars {
    public void mergeSortWithChars(int[] array) {
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
            if (h[leftHIndex] <= h[rightHIndex] && h[rightHIndex] <= '9' ) {
                array[arrayIndex++] = h[leftHIndex++];
            } else if (h[leftHIndex] <= h[rightHIndex] && h[rightHIndex] >= 'A' ) {
                array[arrayIndex++] = h[rightHIndex++];
            } else if (h[leftHIndex] <= h[rightHIndex] && h[rightHIndex] > '9') {
                //....
            }
        }
        while (leftHIndex <= end1) {
            array[arrayIndex++] = h[leftHIndex++];
        }
    }

}
