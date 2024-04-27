package pattern.structure.decorator;

public class EggDecorator extends BatterCakeDecorator{
    public EggDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    public String getMessage() {
        return super.getMessage()+"+1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+2;
    }

    @Override
    protected void addedFunction() {

    }
}
