package pattern.structure.adapter.objectadapter;

public class Test {
    private Adapter adapter;

    public void setAdapter(Adapter adapter) {
        this.adapter = adapter;
    }

    public void output(){
        System.out.println("输出"+adapter.output5V()+"V电压！");
    }
    public static void main(String[] args) {
        Test test = new Test();
        Adapter adapter = new Adapter(new Adaptee());
        test.setAdapter(adapter);
        test.output();
    }
}
