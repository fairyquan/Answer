package pattern.structure.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class ProxyFactory {
    private Object target;//维护一个目标对象

    public ProxyFactory(Object target) {
        this.target = target;
    }
    //给目标对象生成一个代理对象
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始...");
                        //反射机制调用目标对象方法
                        Object returnVal = method.invoke(target, args);
                        System.out.println(returnVal);
                        System.out.println("JDK代理提交");
                        return returnVal;
                    }
                });
    }
}
