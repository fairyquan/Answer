package backtrace;

import java.util.*;

//电话号码的数字组合
public class Solution2 {
    public Map<Character,String> map;
    public List<String> result;
    public StringBuilder tempStr;
    public List<String> letterCombinations(String digits) {
        map=new HashMap<>();
        map.put('0',"");
        map.put('1',"");
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        result=new ArrayList<>();
        tempStr=new StringBuilder();
        backTracking(digits,0);
        return result;
    }
    public void backTracking(String digits,int index){
        if(tempStr.length()==digits.length()){
            result.add(tempStr.toString());
            return;
        }
        Character c = digits.charAt(tempStr.length());
        String str=map.get(c);
        for (int i=0;i<str.length();i++){
            tempStr.append(str.charAt(i));
            backTracking(digits,tempStr.length());
            tempStr.deleteCharAt(tempStr.length()-1);
        }
    }

    public static void main(String[] args) {
        List<String> list = new Solution2().letterCombinations("234");
        System.out.println(list);
    }
}
