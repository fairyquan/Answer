package string;

import java.util.Arrays;

public class Solution5 {
    //暴力解法
    public int strStr1(String haystack,String needle){
        if (needle.equals("")){
            return 0;
        }
        for (int i=0;i<haystack.length();i++){
            int res=i;
            int temp=i;
            int count=0;
            if (haystack.charAt(temp)==needle.charAt(0)){
                for (int j=0;j<needle.length();j++){
                    if (haystack.charAt(temp)==needle.charAt(j)){
                        count++;
                    }
                    temp++;
                    if (temp>=haystack.length()){
                        break;
                    }
                }
                if (count==needle.length()){
                    return res;
                }else {
                    continue;
                }
            }

        }
        return -1;
    }
    //KMP法
    public int strStr(String haystack,String needle){
        if(needle.length()==0){
            return 0;
        }
        int[] next = getNext(needle);

        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            while (j > 0 && needle.charAt(j) != haystack.charAt(i)){
                j = next[j - 1];
            }
            if (needle.charAt(j) == haystack.charAt(i)){
                j++;
            }
            if (j == needle.length()){
                return i - needle.length() + 1;
            }
        }
        return -1;

    }
    public static int[] getNext(String s) {
        int[] next = new int[s.length()];
        int j = 0;//j指向前一个子串相同前后缀的前缀末尾后一位
        next[0] = 0;
        for (int i = 1; i < s.length(); i++) {//j指向前一个子串相同前后缀的后缀末尾后一位，也就是当前串最后一位
            while (j > 0 && s.charAt(j) != s.charAt(i)){
                j = next[j - 1];
            }
            if (s.charAt(j) == s.charAt(i)){
                j++;
            }
            next[i] = j;
        }
        return next;
    }
    public int  re(String s){
        String str=s+s;
        String substring = str.substring(1, str.length() - 1);
        return strStr(substring, s);
    }

    public static void main(String[] args) {

    }


}
