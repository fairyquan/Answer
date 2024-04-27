package stack_queue;


import java.util.Stack;
//有效的括号
public class Solution1 {
    public boolean isValid(String s) {
        Stack<Character> deque = new Stack<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            //碰到左括号，就把相应的右括号入栈
            if (ch == '(') {
                deque.push(')');
            }else if (ch == '{') {
                deque.push('}');
            }else if (ch == '[') {
                deque.push(']');
            }
//            else if (ch!=')' && ch!=']' && ch!='}'){} //有其他字符的情况
            else if (deque.isEmpty() || deque.peek() != ch) {
                return false;
            }else {
                deque.pop();
            }
        }
        //最后判断栈中元素是否匹配
        return deque.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new Solution1().isValid("()"));
    }
}
