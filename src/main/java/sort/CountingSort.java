package sort;

import java.util.Arrays;

public class CountingSort {
    /**
     * Gets the maximum and minimum values in the array
     *
     * @param arr
     * @return
     */
    private static int[] getMinAndMax(int[] arr) {
        int maxValue = arr[0];
        int minValue = arr[0];
        for (int num : arr) {
            if (num > maxValue) {
                maxValue = num;
            } else if (num < minValue) {
                minValue = num;
            }
        }
        return new int[] { minValue, maxValue };
    }

    /**
     * Counting Sort
     *
     * @param arr
     * @return
     */
    public static int[] countingSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int[] extremum = getMinAndMax(arr);
        int minValue = extremum[0];
        int maxValue = extremum[1];
        int[] countArr = new int[maxValue - minValue + 1];
        int[] result = new int[arr.length];
        //记录每个数数量
        for (int num : arr) {
            countArr[num - minValue]++;
        }
        for (int i = 1; i < countArr.length; i++) {
            countArr[i] += countArr[i - 1];
        }
        //倒序遍历，为了排序的稳定性
        for (int i = arr.length - 1; i >= 0; i--) {
            int idx = countArr[arr[i] - minValue] - 1;
            result[idx] = arr[i];
            countArr[arr[i] - minValue] -= 1;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums={4,1,9,3,6,6,8,3,7,5,2};
        int[] ints = countingSort(nums);
        System.out.println(Arrays.toString(ints));
    }

}
