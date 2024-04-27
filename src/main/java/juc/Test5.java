package juc;

import java.util.concurrent.locks.LockSupport;

public class Test5 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+"   start...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"   park...");
            LockSupport.park();
            System.out.println(Thread.currentThread().getName()+"   resume...");

        }, "t1");
        t1.start();
        Thread.sleep(5000);
        System.out.println("unpark...");
        LockSupport.unpark(t1);
    }
}
