package array;

/**
 * 查找升序数组中某个数的范围
 */
public class Solution3 {
    public int[] searchRange(int[] nums,int target){
        int leftBorder=searchLeftBorder(nums,target);
        int rightBorder=searchRightBorder(nums,target);

        if (leftBorder==-2 || rightBorder==-2){
            return new int[]{-1,-1};
        }
        if (rightBorder-leftBorder>1){
            return new int[]{leftBorder+1,rightBorder-1};
        }
        return new int[]{-1,-1};
    }

    public int searchLeftBorder(int[] nums,int target){
        int left=0,right=nums.length-1;
        int leftBorder=-2;
        while (left<=right){
            int mid=left+(right-left)/2;
            if (nums[mid]<target){
                left=mid+1;
            }else {
                right=mid-1;
                leftBorder=right;
            }
        }
        return leftBorder;
    }
    public int searchRightBorder(int[] nums,int target){
        int left=0,right=nums.length-1;
        int rightBorder=-2;
        while (left<=right){
            int mid=left+(right-left)/2;
            if (nums[mid]<=target){
                left=mid+1;
                rightBorder=left;
            }else {
                right=mid-1;
            }
        }
        return rightBorder;
    }

    public static void main(String[] args) {
        int[] range = new Solution3().searchRange(new int[]{1, 4, 5, 6, 6, 6, 7, 9}, 7);
        System.out.println(range);
    }
}
