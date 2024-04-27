package sort;

import java.util.Arrays;

public class ShellSort {
    public static void sort(int[] nums){
        int gap=nums.length;
        while (gap>0){
            for (int i = gap; i < nums.length ; i+=gap) {
                int preIndex=i-gap;
                int curNum=nums[i];
                while (preIndex>=0 && curNum<nums[preIndex]){
                    nums[preIndex+gap]=nums[preIndex];
                    preIndex-=gap;
                }
                nums[preIndex+gap]=curNum;
            }
            gap/=2;
        }
    }
    public static void main(String[] args) {
        int[] nums = {4, 1, 9, 3, 6, 8, 7, 5, 2};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}

