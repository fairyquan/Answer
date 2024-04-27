package backtrace;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution3 {
    List<List<String>> result;
    LinkedList<String> tempStr;
    public List<List<String>> partition(String s) {
        result=new ArrayList<>();
        tempStr=new LinkedList<>();
        backTracking(s);
        return result;
    }
    public void backTracking(String s){
        if (s.equals("")){
            result.add(new LinkedList<>(tempStr));
            return;
        }
        for (int i = 0; i <s.length(); i++) {
            String s1 = s.substring(0, i + 1);
            if (isPalindrome(s1)){
                tempStr.add(s1);
            }else {
                continue;
            }
            backTracking(s.substring(i+1));
            tempStr.removeLast();
        }
    }

    public boolean isPalindrome(String str) {

        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        List<List<String>> aab = new Solution3().partition("aabbaa");
        System.out.println(aab);
    }
}
