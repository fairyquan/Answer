package stack_queue;

import java.util.ArrayDeque;
import java.util.Stack;

//删除相邻重复项
public class Solution2 {
    public String removeDuplicates(String S) {
        ArrayDeque<Character> deque = new ArrayDeque<>();
        char ch;
        for (int i = 0; i < S.length(); i++) {
            ch = S.charAt(i);
            if (deque.isEmpty() || deque.peek() != ch) {//短路效应
                deque.push(ch);
            } else {
                deque.pop();
            }
        }
        String str = "";
        //剩余的元素即为不重复的元素
        while (!deque.isEmpty()) {
            str = deque.pop() + str;
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().removeDuplicates("abbbaacaac"));
    }
}
