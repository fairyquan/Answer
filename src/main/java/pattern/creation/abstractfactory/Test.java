package pattern.creation.abstractfactory;

public class Test {
    public static void main(String[] args) {
        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        IPhone phone = huaWeiFactory.createPhone();
        ILaptop laptop = huaWeiFactory.createLaptop();
        phone.showInfo();
        laptop.showInfo();

        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        IPhone phone1 = xiaoMiFactory.createPhone();
        ILaptop laptop1 = xiaoMiFactory.createLaptop();
        phone1.showInfo();
        laptop1.showInfo();
        //向下转型
        ((XiaoMiPhone) phone1).open();



    }
}
