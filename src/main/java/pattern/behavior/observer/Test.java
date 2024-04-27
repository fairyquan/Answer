package pattern.behavior.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class Test{
    public static void main(String[] args) {
        Observable observable=new Subject();
        User user1=new User("张三");
        User user2=new User("李四");
        User user3=new User("王五");
        observable.addObserver(user1);
        observable.addObserver(user2);
        observable.addObserver(user3);
        observable.notify("abc");


    }
}