package eurekaclientconsumer.demoThread;

import eurekaclientconsumer.demoSort.Num;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest {
    public static void main(String[] args){
    MyThreader threader=new MyThreader();
    MyRunner myRunner=new MyRunner();
    MyCallable myCallable=new MyCallable();
        threader.start();

//        new MyThreader().start();
        new Thread(myRunner,"接口线程1").start();
        new Thread(myRunner,"接口线程2").start();

//        MyCallable myCallable=new MyCallable();
        FutureTask<Integer> futureTask=new FutureTask<Integer>(myCallable);
        new Thread(futureTask,"callable线程").start();
        try {
            System.out.println("callable的返回值为*****"+futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
//        for (int i = 0; i <20 ; i++) {
//            System.out.println(Thread.currentThread().getName()+"****主线程***"+i);
//        }

    }
}
