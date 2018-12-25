package eurekaclientconsumer.demoSynch;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Test {
    private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    public static void main(String[] args) {
        final Test test = new Test();

        new Thread("A") {
            public void run() {
                test.get(Thread.currentThread());
            }

            ;
        }.start();

        new Thread("B") {
            public void run() {
                test.get(Thread.currentThread());
            }

            ;
        }.start();

    }

//    public synchronized void get(Thread thread) {
//        long start = System.currentTimeMillis();
//        System.out.println("线程" + thread.getName() + "开始读操作...");
//
//        System.out.println("线程" + thread.getName() + "正在进行读操作...");
//        try {
//            thread.sleep(50L);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("线程" + thread.getName() + "读操作完毕...");
//    }
    public void get(Thread thread) {
        rwl.readLock().lock(); // 在外面获取锁
        long start = System.currentTimeMillis();
        System.out.println("线程" + thread.getName() + "开始读操作...");
        System.out.println("线程" + thread.getName() + "正在进行读操作...");
        try {
            thread.sleep(50L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程" + thread.getName() + "读操作完毕...");
    }
}
