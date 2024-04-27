package pattern.behavior.template;

public class Test {
    public static void main(String[] args) {
        System.out.println("=========制作红豆豆浆=========");
        RedBeanSoybeanMilk redBeanSoybeanMilk = new RedBeanSoybeanMilk();
        redBeanSoybeanMilk.make();

        System.out.println("=========制作花生豆浆=========");
        PeanutSoybeanMilk peanutSoybeanMilk=new PeanutSoybeanMilk();
        peanutSoybeanMilk.make();

        System.out.println("=========制作纯豆浆=========");
        PureSoybeanMilk pureSoybeanMilk=new PureSoybeanMilk();
        pureSoybeanMilk.make();
    }
}
