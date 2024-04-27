package string;

import java.util.Arrays;

//替换空格
public class Solution2 {
    public String replaceTrim(String s,String replaceStr){
        int trimCount=0;
        if (s==null){
            return null;
        }

        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==' '){
                trimCount++;
            }
        }
        char[] res=new char[s.length()+trimCount*(replaceStr.length()-1)];
        int j=res.length-1;
        for (int i=s.length()-1;i>=0;i--){
            if (s.charAt(i)!=' '){
                res[j]=s.charAt(i);
                j--;
            }else {
                for (int m=replaceStr.length()-1;m>=0;m--){
                    res[j]=replaceStr.charAt(m);
                    j--;
                }

            }

        }
        return new String(res);

    }

    public static void main(String[] args) {
        String s = new Solution2().replaceTrim("asa asad", "+=");
        System.out.println(s);


    }
}
