package pattern.structure.adapter.classadapter;

public class Test {
    Adapter adapter;

    public void setAdapter(Adapter adapter) {
        this.adapter = adapter;
    }

    public void output(){
        System.out.println("输出"+adapter.output5V()+"V电压！");
    }
    public static void main(String[] args) {
        Adapter adapter=new Adapter();
        Test test = new Test();
        test.setAdapter(adapter);
        test.output();
    }
}
