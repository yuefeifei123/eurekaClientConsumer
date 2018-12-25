package eurekaclientconsumer.testWrite;

/**饿汉式单例模式
 * @author feifei
 * 加synchronized是为了多线程操作可能出现的多例的问题；
 */
public class SingleTon2 {
    private SingleTon2(){}
    private static SingleTon2 singleTon2=new SingleTon2();
    public static synchronized SingleTon2 getSingleTon2(){
        return singleTon2;
    }
}
