package hashtable;

import java.util.HashMap;
import java.util.Map;

//赎金信
public class Solution2 {
    //数组解法
    public boolean canConstruct0(String ransomNote, String magazine) {
        // 定义一个哈希映射数组
        int[] record = new int[26];

        // 遍历
        for(char c : magazine.toCharArray()){
            record[c - 'a'] += 1;
        }

        for(char c : ransomNote.toCharArray()){
            record[c - 'a'] -= 1;
        }

        // 如果数组中存在负数，说明ransomNote字符串总存在magazine中没有的字符
        for(int i : record){
            if(i < 0){
                return false;
            }
        }

        return true;
    }
    //使用map解法
    public boolean canConstruct(String a,String b){
        Map<Character,Integer> map=new HashMap<>();
        for (Character c:b.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (int i=0;i<a.length();i++){
            if (map.containsKey(a.charAt(i)) && map.getOrDefault(a.charAt(i),0)>0){
                map.put(a.charAt(i),map.get(a.charAt(i))-1);
            }else {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(new Solution2().canConstruct0("abcddf","abcccddd"));
        System.out.println(new Solution2().canConstruct("abcddf","abcccddd"));
    }
}
