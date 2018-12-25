package eurekaclientconsumer.demoThread;

import eurekaclientconsumer.testWrite.SingleTon;

public class MyThreader extends Thread {
    @Override
    public void run() {
//        for (int i = 0; i <20 ; i++) {
//            System.out.println(getName()+"***"+i);
//        }
        System.out.println(SingleTon.getSingleTon());
    }
}
