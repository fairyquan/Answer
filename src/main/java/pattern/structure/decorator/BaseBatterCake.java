package pattern.structure.decorator;

/**
 * 具体构件
 */
public class BaseBatterCake implements BatterCake {
    @Override
    public String getMessage() {
        return "煎饼果子";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
