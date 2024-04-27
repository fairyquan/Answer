package sort;

import java.util.Arrays;

public class SelectionSort {
    /**
     * 选择排序
     * @param arr
     * @return arr
     */
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums={4,1,9,3,6,8,7,5,2};
        int[] ints = selectionSort(nums);
        System.out.println(Arrays.toString(ints));

    }
}
