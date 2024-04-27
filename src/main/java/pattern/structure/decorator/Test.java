package pattern.structure.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("======基础版==========");
        BatterCake batterCake = new BaseBatterCake();
        System.out.println(batterCake.getMessage()+",总价格"+batterCake.getPrice()+"元");

        System.out.println("======加鸡蛋==========");
        batterCake= new EggDecorator(batterCake);
        System.out.println(batterCake.getMessage()+",总价格"+batterCake.getPrice()+"元");

        System.out.println("======加鸡蛋加香肠==========");
        batterCake= new SausageDecorator(batterCake);
        System.out.println(batterCake.getMessage()+",总价格"+batterCake.getPrice()+"元");


    }
}
