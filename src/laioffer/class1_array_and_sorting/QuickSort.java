package laioffer.class1_array_and_sorting;

/**
 * Created by guangshuo on 3/14/17.
 * select last item in the array as pivot
 *
 /* Keep moving things smaller than the pivot to the left want things bigger than the pivot to the right.
 e.g.: 3 1 5 2 4
 Round 1: select 3 as the pivot
 Partition:
 4 1 5 2 3  to make sure left to i are smaller than pivo||right to j
 i     j	so now a[i]>a[j], and a[i]>3,a[j]<3, swap, i++, j--;
 2 1 5 4 3  now a[i]<3,a[j]>3, i++, j--;
 i j
 end, insert 3 to right position: where now a[i]=pivot,move the array from index i
 2 1 3 5 4

 Performance:
 Ideally :
    3 1 4 ... n
  (1/2 * N) | (1/2 * N)         第一层： N
                                第二层： N
   ....
    一共logN 层 -- NlogN
 Worst Case:
 (N-1) | (1) N 层 -- N^2
 */
public class QuickSort {
    public int[] quickSort(int[] array) {
        if(array == null || array.length == 0) {
            return array;
        }
        quickSort(array, 0, array.length - 1);
        return array;
    }
    public void quickSort(int[] array, int i, int j) {
        if (i >= j) {
            return;
        }
        int pivotIndex = partition(array, i, j);
        quickSort(array, i, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, j);

    }
    public int partition(int[] array, int i, int j) {
        int pivot = pickRandom(i, j);
        swap(array, pivot, j);
        int curPivot = j;
        j = j - 1;
        while(i <= j) {
            if(array[i] < array[curPivot]) {
                i++;
            } else if(array[j] >= array[curPivot]) {
                j--;
            } else {
                swap(array, i++, j--);
            }
        }
        swap(array, i, curPivot);
        return i;
    }
    public int pickRandom(int i, int j) {
        return (int) (Math.random() * (j - i + 1) + i);
    }
    public void swap(int[] array, int p, int q) {
        int temp = array[p];
        array[p] = array[q];
        array[q] = temp;
    }
}
