package pattern.behavior.state.sample2;

/**
 * 空闲状态
 *
 */
public class FreeState implements State {
 
    @Override
    public void handle() {
        System.out.println("房间空闲！！！没人住！");
    }
}