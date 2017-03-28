package laioffer.class1_array_and_sorting;

/**
 * Created by guangshuo on 3/12/17.
 * Example: int a[i] = {-1, -3, 4, 7} => {-3, -1, 4, 7}
 * 1. find global min, swap i and index_min, i++
 * 2. keep doing so until i hit array.length - 2;
 * */
public class SelectionSort {
    public void selectionSort(int a[]) {
        if (a == null || a.length == 0) {
            return;
        }
        int global;
        for (int i = 0; i < a.length - 1; i++) {
            global = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[global]) {
                    global = j;
                }
            }
            swap(a, global, i);
        }
    }
    private void swap(int[] a, int p1, int p2) {
        int temp = a[p1];
        a[p1] = a[p2];
        a[p2] = temp;
    }
}
