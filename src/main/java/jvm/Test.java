package jvm;

import sun.misc.Unsafe;

import java.lang.reflect.Field;


public class Test {
    static int _1Gb=1024*1024*1024;

    public static void main(String[] args) {
//          Unsafe unsafe=getUnsafe();
//        long base = unsafe.allocateMemory(_1Gb);
//        unsafe.setMemory(base,_1Gb,(byte) 0);
//        System.in.read();
//        unsafe.freeMemory(base);
//        System.in.read();

        for (int i = 0; i < 200; i++) {
            long start=System.nanoTime();
            for (int j = 0; j < 1000; j++) {
                new Object();
            }
            long end=System.nanoTime();
            System.out.printf("%d\t%d\n",i,end-start);
        }
    }

    public static Unsafe getUnsafe(){
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            Unsafe unsafe = (Unsafe) field.get(null);
            return unsafe;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}


