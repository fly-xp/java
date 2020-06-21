package demo.d3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyDemo implements InvocationHandler {
    Object obj;//被代理的对象

    public ProxyDemo(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + "beginning");
        Object invoke = method.invoke(this.obj, args);//执行的是指定代理对象的指定的方法
        System.out.println(method.getName() + "ending");
        return invoke;
    }
}
