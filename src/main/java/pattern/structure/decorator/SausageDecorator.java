package pattern.structure.decorator;

public class SausageDecorator extends BatterCakeDecorator{

    public SausageDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    public String getMessage() {
        return super.getMessage()+"+1个香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+4;
    }

    @Override
    protected void addedFunction() {

    }
}
