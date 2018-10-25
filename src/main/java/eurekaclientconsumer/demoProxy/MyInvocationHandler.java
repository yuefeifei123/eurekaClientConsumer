package eurekaclientconsumer.demoProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MyInvocationHandler implements InvocationHandler {

    private Object proxied;

    MyInvocationHandler(Object proxied){
        this.proxied=proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        System.out.println("begin to invoke method:"+method.getName()+" params:"+ Arrays.toString(args));
        Object result=method.invoke(proxied,args);
//        Object result=method.invoke(demoProxy,args);
        System.out.println("invoke "+method.getName()+" end");
        return result;
    }

}
