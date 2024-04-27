package backtrace;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//求子集
public class Solution5 {
    List<List<Integer>> result;
    LinkedList<Integer> temp;
    public List<List<Integer>> subsets(int[] nums) {
        result=new ArrayList<>();
        temp=new LinkedList<>();
        result.add(new ArrayList<>(temp));//添加空集
        backTracking(nums,0);
        return result;
    }
    public void backTracking(int[] nums,int startIndex){
        for (int i=startIndex;i<nums.length;i++){
            temp.add(nums[i]);
            result.add(new ArrayList<>(temp));
            backTracking(nums,i+1);
            temp.removeLast();

        }
    }

    public static void main(String[] args) {
        List<List<Integer>> subsets = new Solution5().subsets(new int[]{1,2,3});
        System.out.println(subsets);

    }
}
