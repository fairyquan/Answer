package pattern.structure.adapter.objectadapter;

public class Adapter implements ITarget{
    private Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee=adaptee;
    }

    @Override
    public int output5V() {
        int val = adaptee.output220V();
        System.out.println(val+"V->"+"5V");
        return 5;
    }
}
