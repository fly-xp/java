package demo.d3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        ITdemo test = new ITdmoImpl();
        /*
         * 注意：如果一个对象想要通过Proxy.newProxyInstance方法被代理
         * 那么这个对象的类一定要有相应的接口*/
        test.test1();
        test.test2();
        System.out.println("=====================");
        /*
         * Proxy.newProxyInstance(ClassLoader,Interfaces,h)
         * 参数1是代理对象的类加载器
         * 参数2是被代理对象的接口
         * 参数3是代理对象*/
        InvocationHandler handler = new ProxyDemo(test);
        ITdemo t = (ITdemo) Proxy.newProxyInstance(handler.getClass().getClassLoader(), test.getClass().getInterfaces(), handler);
        t.test1();
        t.test2();
    }
}
