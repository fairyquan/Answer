package string;
//左旋字符串
public class Solution4 {
    public String reverseLeftWords(String s, int n) {
        int len=s.length();
        StringBuilder sb=new StringBuilder(s);
        reverseString(sb,0,len-1);
        reverseString(sb,0,len-n-1);
        reverseString(sb,len-n,len-1);
        return sb.toString();
    }
    public void reverseString(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String s = new Solution4().reverseLeftWords("abcde", 2);
        System.out.println(s);
    }
}
