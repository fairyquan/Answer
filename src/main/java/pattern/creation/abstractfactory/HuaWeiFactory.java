package pattern.creation.abstractfactory;

public class HuaWeiFactory implements AbstractFactory{
    @Override
    public IPhone createPhone() {
        return new HuaWeiPhone();
    }

    @Override
    public ILaptop createLaptop() {
        return new HuaWeiLaptop();
    }
}
