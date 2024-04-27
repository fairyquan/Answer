package sort;

import java.util.Arrays;

public class BubbleSort {

    /**
     * 冒泡排序
     * @param arr
     * @return arr
     */
    public static int[] bubbleSort(int[] arr) {
        int count=0;
        for (int i = 1; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    count++;
                    if(count==8){
                        System.out.println(arr);
                    }
                    // Change flag
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        System.out.println(count);
        return arr;
    }

    public static void main(String[] args) {
        int[] nums={64,34,25,12,22,11,90};
        int[] ints = bubbleSort(nums);
        System.out.println(Arrays.toString(ints));
    }
}
