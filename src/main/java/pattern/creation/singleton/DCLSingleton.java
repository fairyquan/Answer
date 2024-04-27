package pattern.creation.singleton;

final class  DCLSingleton{
    private volatile static DCLSingleton dclSingleton;//添加volatile属性防止指令重排
    private DCLSingleton(){
    }
    public static  DCLSingleton getInstance(){
        if (dclSingleton==null){
            synchronized (DCLSingleton.class){
                if(dclSingleton==null){
                    dclSingleton=new DCLSingleton();
                }
            }
        }
        return dclSingleton;
    }

}