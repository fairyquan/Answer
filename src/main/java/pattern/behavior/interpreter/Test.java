package pattern.behavior.interpreter;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.calculate("1 2 3 + 4 * + 5 - 2 ^");
        System.out.println(result);
    }
}
