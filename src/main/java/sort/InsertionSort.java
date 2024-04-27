package sort;

import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int preIndex = i - 1;
            int curNum = nums[i];
            while (preIndex >= 0 && curNum < nums[preIndex]) {
                nums[preIndex + 1] = nums[preIndex];
                preIndex--;
            }
            nums[preIndex + 1] = curNum;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 9, 3, 6, 8, 7, 5, 2};
        int[] ints = insertionSort(nums);
        System.out.println(Arrays.toString(ints));
    }
}
