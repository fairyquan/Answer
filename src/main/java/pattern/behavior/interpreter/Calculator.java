package pattern.behavior.interpreter;


import java.util.Stack;

public class Calculator {

    public int calculate(String expression) {
        Stack<Expression> stack = new Stack<>();

        for (String token : expression.split(" ")) {
            if (isOperator(token)) {
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(new AddExpression(leftExpression, rightExpression));
                        break;
                    case "-":
                        stack.push(new SubtractExpression(leftExpression, rightExpression));
                        break;
                    case "*":
                        stack.push(new MultiplyExpression(leftExpression, rightExpression));
                        break;
                    case "/":
                        stack.push(new DivideExpression(leftExpression, rightExpression));
                        break;
                    case "^":
                        stack.push(new PowExpression(leftExpression, rightExpression));
                        break;
                }
            } else {
                Expression expressionObj = new NumberExpression(Integer.parseInt(token));
                stack.push(expressionObj);
            }
        }
        return stack.pop().interpret();
    }

    private boolean isOperator(String token) {
        return "+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token) || "^".equals(token);
    }
}