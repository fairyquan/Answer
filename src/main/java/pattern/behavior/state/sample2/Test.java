package pattern.behavior.state.sample2;

public class Test {
    public static void main(String[] args) {
        // 获取房间对象
        HomeContext ctx = new HomeContext();
        // 设置房间状态
        ctx.setState(new FreeState());
        ctx.setState(new BookedState());
    }
}
