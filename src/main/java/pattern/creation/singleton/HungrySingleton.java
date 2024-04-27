package pattern.creation.singleton;

class HungrySingleton {
    //饿汉式创建单例对象
    private static final HungrySingleton singleton = new HungrySingleton();
    //构造方法私有化
    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return singleton;
    }

}