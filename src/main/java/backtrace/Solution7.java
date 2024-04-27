package backtrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//N皇后问题
public class Solution7 {

    private List<List<String>> result;

    public List<List<String>> solveNQueens(int n) {
        result = new ArrayList<>();
        String[][] ans=new String[n][n];
        for (int i=0;i<ans.length;i++){
            Arrays.fill(ans[i],".");
        }
        backTracking(ans,0);
        return result;
    }
    public void backTracking(String[][] ans,int level){
        if (level==ans.length){
            List<String> temp=new ArrayList<>();
            for (int i=0;i<ans.length;i++){
                String str="";
                for (int j=0;j<ans.length;j++){
                    str+=ans[i][j];
                }
                temp.add(str);
            }
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i=0;i< ans.length;i++){
            if (!check(ans,level,i)) continue;
            ans[level][i]="Q";
            backTracking(ans,level+1);
            ans[level][i]=".";
        }
    }
    public boolean check(String[][] ans,int x,int y){
        for (int i=x, j=y;i>=0&&j>=0;i--,j--){
            if (ans[i][j].equals("Q")) return false;
        }
        for (int i=x, j=y;i>=0&&j<ans.length;i--,j++){
            if (ans[i][j].equals("Q")) return false;
        }
        for (int i=x;i>=0;i--){
            if (ans[i][y].equals("Q")) return false;
        }
        return true;
    }

   public static String[][] fillDots(String[][] ans,int x,int y){
        //纵向
       for (int i = 0; i < ans.length; i++) {
           ans[i][y]=".";
       }
        //横向
       for (int i = 0; i < ans.length; i++) {
           ans[x][i]=".";
       }
       //左斜方
       for (int i=x,j=y;i< ans.length&&j< ans.length;i++,j++){
           ans[i][j]=".";
       }
       for (int i=x,j=y;i>=0&&j>=0;i--,j--){
           ans[i][j]=".";
       }
       //右斜方
       for (int i=x,j=y;i< ans.length&&j>=0;i++,j--){
           ans[i][j]=".";
       }
       for (int i=x,j=y;i>=0 && j<ans.length;i--,j++){
           ans[i][j]=".";
       }
       ans[x][y]="Q";
       return ans;
   }

    public static void main(String[] args) {
        List<List<String>> lists = new Solution7().solveNQueens(4);
        System.out.println(lists);

    }
}
