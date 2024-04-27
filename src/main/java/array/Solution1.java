package array;

/**
 * 二分查找
 */
public class Solution1 {
   protected int search(int[] nums,int target){
      // 避免当 target 小于nums[0] nums[nums.length - 1]时多次循环运算
      if (target < nums[0] || target > nums[nums.length - 1]) {
         return -1;
      }
      int left = 0, right = nums.length - 1;
      while (left <= right) {
         int mid = left + ((right - left) / 2);
         if (nums[mid] == target)
            return mid;
         else if (nums[mid] < target)
            left = mid +1;
         else if (nums[mid] > target)
            right = mid -1;
      }
      return -1;
   }
   //二分查找写法二（作为标准写法，遵循左闭右开原则）
   public int binarySearch(int[] nums, int target) {
      int left = 0, right = nums.length;
      while (left < right) {
         int mid = left + ((right - left) >> 1);
         if (nums[mid] == target) {
            return mid;
         } else if (nums[mid] < target){
            left = mid +1;
         } else if (nums[mid] > target) {
            right = mid;
         }
      }
      return -1;
   }

   public static void main(String[] args) {
      int index = new Solution1().binarySearch(new int[]{1,2}, 3);
      System.out.println(index);
   }
}
