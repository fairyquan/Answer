package backtrace;

import java.util.*;

//组合
public class Solution1 {


    private int size;
    public List<List<Integer>> combine(int n, int k){
        result = new ArrayList<>();
        temp=new LinkedList<>();
        size=k;
        backTracking(1,n,k);
        return  result;

    }
    public void backTracking(int startIndex,int n,int k){
        if (temp.size()==size){
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i=startIndex;i<=n-k+1;i++){
            temp.add(i);
            backTracking(i+1,n,k-1);
            temp.removeLast();
        }
    }
    int sum;
    List<List<Integer>> result;
    LinkedList<Integer> temp;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        sum=0;
        result=new ArrayList<>();
        temp=new LinkedList<>();
        if(candidates.length==0) return result;
        Arrays.sort(candidates);
        backTracking(candidates,0,target);
        return result;
    }
    public void backTracking(int[] candidates,int begin,int target){
        if(sum>target) return;
        if(sum==target){
            result.add(new LinkedList<>(temp));
            return;
        }
        Set<Integer> set=new HashSet<>();
        for (int i=begin;i<candidates.length;i++){
            if (set.contains(candidates[i])){
                continue;
            }
            set.add(candidates[i]);
            temp.add(candidates[i]);
            sum+=candidates[i];
            backTracking(candidates,i+1,target);
            temp.removeLast();
            sum-=candidates[i];
        }
    }


    public static void main(String[] args) {
        List<List<Integer>> list = new Solution1().combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        System.out.println(list);
    }
}
