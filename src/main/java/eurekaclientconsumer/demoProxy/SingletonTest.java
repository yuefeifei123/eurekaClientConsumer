package eurekaclientconsumer.demoProxy;

public class SingletonTest {

    public static void main(String[] args){
        System.out.println("****first create and get singleton1****");
        System.out.println(Singleton1.getSingleton1());
        System.out.println("****second create and get singleton1****");
        System.out.println(Singleton1.getSingleton1());
        System.out.println("-----------------");
        System.out.println("****first create and get singleton2****");
        System.out.println(Singleton2.getSingleton2());
        System.out.println("****second create and get singleton2****");
        System.out.println(Singleton2.getSingleton2());
    }
}