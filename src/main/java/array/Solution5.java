package array;

/**
 * 长度最小的子数组
 */
public class Solution5 {
    public int minSubArrayLen(int[] nums,int s){
        int length=0;
        int result=Integer.MAX_VALUE;
        int sum=0;
        int i=0;
        for (int j=0;j<nums.length;j++){
            sum+=nums[j];
            while (sum>=s){
                length=j-i+1;
                result= Math.min(result, length);//Math.min底层就是用了条件语句
                sum-=nums[i++];
            }
        }
        return result==Integer.MAX_VALUE?0:result;
    }

    public static void main(String[] args) {
        int len = new Solution5().minSubArrayLen(new int[]{2, 1, 0, 3, 1, 4, 2, 3, 1}, 7);
        System.out.println(len);
    }
}
