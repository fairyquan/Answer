package string;
//字符串反转
public class Solution1 {
    public char[] strReverse(char[] s){
        int left=0;
        int right=s.length-1;
        while (left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        return s;
    }
    public String strReverse(String s,int k){
        int length=s.length();
        int start=0;
        StringBuilder res=new StringBuilder();

        while (start<length){
            int firstK= Math.min(start+k, length);
            int secondK= Math.min(start+2*k, length);
            StringBuilder temp= new StringBuilder();
            temp.append(s, start, firstK);
            res.append(temp.reverse());
            res.append(s,firstK,secondK);
            start+=2*k;
        }
        return res.toString();

    }


    public static void main(String[] args) {
        char[] chars={'a','b','c','d'};
        char[] strReverse = new Solution1().strReverse(chars);
        System.out.println(strReverse);

    }

}
