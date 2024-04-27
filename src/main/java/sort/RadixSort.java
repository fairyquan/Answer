package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort {
    /**
     * Radix Sort
     *
     * @param arr
     * @return
     */
    public static int[] radixSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int N = 1;//最大数位数
        int maxValue = arr[0];
        for (int element : arr) {
            if (element > maxValue) {
                maxValue = element;
            }
        }
        while (maxValue / 10 != 0) {
            maxValue = maxValue / 10;
            N++;
        }
        for (int i = 0; i < N; i++) {
            List<List<Integer>> radix = new ArrayList<>();
            for (int k = 0; k < 10; k++) {
                radix.add(new ArrayList<>());
            }

            for (int element : arr) {
                int idx = (element / (int) Math.pow(10, i)) % 10;
                radix.get(idx).add(element);
            }

            int idx = 0;
            for (List<Integer> l : radix) {
                for (int n : l) {
                    arr[idx++] = n;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums={17,316,312,400,17,27,36,45};
        int[] ints = radixSort(nums);
        System.out.println(Arrays.toString(ints));
    }

}
