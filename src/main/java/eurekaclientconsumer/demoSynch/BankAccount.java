package eurekaclientconsumer.demoSynch;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.ReentrantLock;
@Slf4j
public class BankAccount
{
    //账户余额
    private Integer balance;
    //定义一个锁：
    private final ReentrantLock lock=new ReentrantLock();
    //初始化账户
    public BankAccount(Integer balance){this.balance=balance;}
    //getter
    public  Integer getBalance() {
        return balance;
    }
    //将账户余额的钱减少
    private void reduceBalance(Integer balance) {
        this.balance=this.balance-balance;
    }
    //存取钱线程通信条件;为真存钱，取钱等待；为假取钱，存钱等待；
    private boolean flag=true;

    /**往账户存钱
     * @param balance 存钱数
     */
    public synchronized void saveBalance(Integer balance) {
        try {
            if (!flag) {
                //flag为假取钱，此时存钱等待；
                wait();
            }
            log.info(Thread.currentThread().getName() + "***存钱前账户余额为：****" + this.getBalance());
            //修改余额
            this.balance = this.balance + balance;
            log.info(Thread.currentThread().getName() + "***存钱后账户余额为：****" + this.getBalance());
            //更改状态标志为取钱，唤醒取钱线程
            flag=false;
            notifyAll();
        }catch (InterruptedException ie){
            ie.getMessage();
        }
    }


    /**从账户取钱
     * @param drawAmount 取钱数
     */
    public synchronized void drawBalance(Integer drawAmount) {
        try{
            if (flag) {
                //flag为真存钱，取钱等待；
                wait();
            }
            if (balance >= drawAmount) {
                log.info(Thread.currentThread().getName()+"***取钱前账户余额为：****"+this.getBalance());
                //修改余额
                this.reduceBalance(drawAmount);
                log.info(Thread.currentThread().getName()+"***取钱后账户余额为：****"+this.getBalance());
            } else {
                log.info(Thread.currentThread().getName()+"****余额不足，取钱失败*****");
            }
            //更改状态标志为存钱，唤醒存钱线程
            flag=true;
            notifyAll();
        }catch (InterruptedException ie){
            ie.getMessage();
        }
    }

    //从账户取钱的lock锁
//    public   void drawBalanceLock(Integer drawAmount) {
//        //ReentrantLock lock=new ReentrantLock();//没有锁的效果了
//        lock.lock();
//        try {
//
//            //lock.lock();//可能发生锁异常关闭
//            if (balance > drawAmount) {
//                System.out.println(Thread.currentThread().getName() + "***取钱前账户余额为：****" + this.getBalance());
//                //修改余额
//                this.reduceBalance(drawAmount);
//                System.out.println(Thread.currentThread().getName() + "***取钱后账户余额为：****" + this.getBalance());
//            } else {
//                System.out.println(Thread.currentThread().getName() + "****余额不足，取钱失败*****");
//            }
//        }catch(Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//        finally {
//            lock.unlock();
//        }
//    }

}
