package array;

/**
 * 有序数组的平方
 */
public class Solution4 {
    public int[] sortedSquares(int[] nums) {
        int right = nums.length - 1;
        int left = 0;
        int[] result = new int[nums.length];
        int index = nums.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                // 正数的相对位置是不变的， 需要调整的是负数平方后的相对位置
                result[index--] = nums[left] * nums[left++];
            } else {
                result[index--] = nums[right] * nums[right--];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] squares = new Solution4().sortedSquares(new int[]{-3, 1, 2, 5});
        System.out.println(squares);
    }
}
