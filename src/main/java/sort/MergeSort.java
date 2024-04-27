package sort;

import java.util.Arrays;

public class MergeSort {
    /**
     * 归并排序
     *
     * @param arr
     * @return arr
     */
    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int middle = arr.length / 2;
        int[] arr_1 = Arrays.copyOfRange(arr, 0, middle);
        int[] arr_2 = Arrays.copyOfRange(arr, middle, arr.length);
        return merge(mergeSort(arr_1), mergeSort(arr_2));
    }

    /**
     * Merge two sorted arrays
     *
     * @param arr_1
     * @param arr_2
     * @return sorted_arr
     */
    private static int[] merge(int[] arr_1, int[] arr_2) {
        int[] sorted_arr = new int[arr_1.length + arr_2.length];
        int idx = 0, idx_1 = 0, idx_2 = 0;
        while (idx_1 < arr_1.length && idx_2 < arr_2.length) {
            sorted_arr[idx++]=arr_1[idx_1]<arr_2[idx_2] ? arr_1[idx_1++]:arr_2[idx_2++];
        }
        if (idx_1 < arr_1.length) {
            while (idx_1 < arr_1.length) {
                sorted_arr[idx++] = arr_1[idx_1++];
            }
        } else {
            while (idx_2 < arr_2.length) {
                sorted_arr[idx++] = arr_2[idx_2++];
            }
        }
        return sorted_arr;
    }
    public static void main(String[] args) {
        int[] nums={4,1,9,3,6,8,7,5,2};
        int[] ints = mergeSort(nums);
        System.out.println(Arrays.toString(ints));
    }
}
