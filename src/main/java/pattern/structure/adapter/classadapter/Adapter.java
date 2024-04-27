package pattern.structure.adapter.classadapter;

public class Adapter extends Adaptee implements ITarget{
    @Override
    public int output5V() {
        int val = output220V();
        System.out.println(val+"V->"+"5V");
        return 5;
    }
}
