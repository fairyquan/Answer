package backtrace;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution4 {

    private List<String> result;
    private LinkedList<String> temp;

    public List<String> restoreIpAddresses(String s) {
        result = new ArrayList<>();
        temp=new LinkedList<>();
        if(s.length()<4||s.length()>12) return result;
        backTracking(s);
        return result;
    }
    public void backTracking(String s){
        if (temp.size()==4){
            if (s.equals("")){
                String str=temp.get(0)+"."+temp.get(1)+"."+temp.get(2)+"."+temp.get(3);
                result.add(str);
            }
            return;
        }
        for (int i=0;i<s.length();i++){
            if (isValidNumber(s.substring(0,i+1))){
                temp.add(s.substring(0,i+1));
            }else {
                continue;
            }
            backTracking(s.substring(i+1));
            temp.removeLast();
        }

    }
    public static boolean isValidNumber(String s){
        if (s==null || s.equals("")){
            return false;
        }
        Long i = Long.parseLong(s);
        if (s.length()>=2 && s.charAt(0) == '0'){
            return false;
        }
        return i >= 0 && i <= 255;
    }

    public static void main(String[] args) {
        List<String> list = new Solution4().restoreIpAddresses("25525511135");
        System.out.println(list);
    }

}
