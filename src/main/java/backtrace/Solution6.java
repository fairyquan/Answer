package backtrace;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//全排列
public class Solution6 {

    private List<List<Integer>> result;
    private LinkedList<Integer> temp;

    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        temp = new LinkedList<>();
        boolean[] used=new boolean[nums.length];
        backTrcking(nums,used);
        return result;
    }
    public void backTrcking(int[] nums,boolean[] used){
        if (temp.size()==nums.length){
            result.add(new LinkedList<>(temp));
            return;
        }
        for (int i=0;i<nums.length;i++){
            if (used[i]) continue;
            temp.add(nums[i]);
            used[i]=true;
            backTrcking(nums,used);
            used[i]=false;
            temp.removeLast();

        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution6().permute(new int[]{1,2,3}));
    }
}
