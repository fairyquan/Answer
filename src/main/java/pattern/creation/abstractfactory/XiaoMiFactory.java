package pattern.creation.abstractfactory;

public class XiaoMiFactory implements AbstractFactory{
    @Override
    public IPhone createPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public ILaptop createLaptop() {
        return new XiaoMiLaptop();
    }
}
