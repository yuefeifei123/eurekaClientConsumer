package eurekaclientconsumer.demoProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
//动态代理
public class ProxyTwo {

    public static void main(String[] args){
        InvocationHandler handler = new MyInvocationHandler(new DoTaskImp());
        DoTask proxy = (DoTask) Proxy.newProxyInstance(
                DoTask.class.getClassLoader(),
                new Class[] { DoTask.class },
                handler);
        proxy.doEveryDay();
    }
}
