package eurekaclientconsumer.testWrite;

import eurekaclientconsumer.demoThread.MyThreader;

/**懒汉式单例模式--西安、线程安全
 * @author feifei
 * 加synchronized是为了多线程操作可能出现的多例的问题；
 */
public class SingleTon {
    private SingleTon(){}
    private static  SingleTon singleTon=null;
    public static synchronized SingleTon getSingleTon(){
        if(singleTon==null){
            singleTon=new SingleTon();
        }
        return singleTon;
    }
    public static void main(String[] args){
        new MyThreader().start();
        new MyThreader().start();
        new MyThreader().start();
        new MyThreader().start();
        new MyThreader().start();
        new MyThreader().start();
        new MyThreader().start();
        new MyThreader().start();
        new MyThreader().start();



    }
}
