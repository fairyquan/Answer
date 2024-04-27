package greedy;

import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

//分发饼干
public class Solution1 {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=g.length-1;
        int j=s.length-1;
        while (i>=0 && j>=0){
            if (s[j]>=g[i]){
                count++;
                i--;
                j--;
            }else {
                i--;
            }

        }
       return count;
    }

    public static void main(String[] args) {



    }
}
