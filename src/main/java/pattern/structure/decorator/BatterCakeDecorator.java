package pattern.structure.decorator;

abstract class BatterCakeDecorator implements BatterCake{
    //静态代理，委托
    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    @Override
    public String getMessage() {
        return this.batterCake.getMessage();
    }

    @Override
    public int getPrice() {
        return this.batterCake.getPrice();
    }
    protected abstract void addedFunction();
}
