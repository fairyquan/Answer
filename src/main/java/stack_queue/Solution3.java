package stack_queue;

import java.util.Stack;

//逆波兰表达式求值
public class Solution3 {
    public int evalRPN(String[] tokens){
        Stack<Integer> stack=new Stack<>();
        for (String value : tokens) {
            if (value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/")) {
                int var1 = stack.pop();
                int var2 = stack.pop();
                if (value.equals("+")) stack.push(var2 + var1);
                if (value.equals("-")) stack.push(var2 - var1);
                if (value.equals("*")) stack.push(var2 * var1);
                if (value.equals("/")) stack.push(var2 / var1);
            } else {
                stack.push(Integer.valueOf(value));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] strings={"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(new Solution3().evalRPN(strings));
    }
}
