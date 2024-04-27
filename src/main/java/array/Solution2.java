package array;

/**
 * 搜索插入位置
 */
public class Solution2 {
    protected int searchInsert(int[] nums,int target){

        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] < target){
                left = mid + 1;
            } else if (nums[mid] > target){
                right = mid - 1;
            }
        }
        return right+1;
    }

    public static void main(String[] args) {
        int index = new Solution2().searchInsert(new int[]{1, 3, 4, 6, 8, 9}, 2);
        System.out.println(index);
    }
}
