package juc;

import static java.lang.Thread.sleep;

public class Test4 {
    static int r=0;
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main开始");
        Thread t1 = new Thread(() -> {
            System.out.println("线程开始");
            try {
                sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程结束");
            r=10;
        }, "t1");
        t1.start();
        t1.join();
        System.out.println("结果为："+r);
        System.out.println("main结束");

    }
}
