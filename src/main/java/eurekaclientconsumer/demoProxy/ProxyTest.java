package eurekaclientconsumer.demoProxy;

//静态代理
public class ProxyTest {
    public static void main(String[] args){
        DoTask doTask=new DoTaskProxy(new DoTaskImp());
        doTask.doEveryDay();


        DoTaskProxy doTaskProxy=new DoTaskProxy(new DoTaskImp());
        doTaskProxy.doEveryDay();
    }
}
