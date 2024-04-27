package pattern.creation.abstractfactory;

public class XiaoMiPhone implements IPhone{
    @Override
    public void showInfo() {
        System.out.println("小米手机");
    }
    public void open(){
        System.out.println("小米手机开机");
    }
}
