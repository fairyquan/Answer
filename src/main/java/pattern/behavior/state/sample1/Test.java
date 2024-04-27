package pattern.behavior.state.sample1;

public class Test {
    public static void main(String[] args) {
        State state=new ConcreteStateA();
        Context context=new Context();
        context.setState(state);
        context.request("状态A");
    }
}
