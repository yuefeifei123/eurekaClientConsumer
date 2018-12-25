package eurekaclientconsumer.demoSynch;

public class BankMainTest {
    public static void main(String[] args){
        //初始化账户有3000余额
        BankAccount bankAccount=new BankAccount(800);
//        //线程一取钱；
//        new BankDrawThreader(bankAccount,2000).start();
//        //线程二取钱：
//        new BankDrawThreader(bankAccount,1500).start();
        //runnable线程1取钱
        BankDrawRunner bankDrawRunner=new BankDrawRunner(bankAccount,2000);
        //runnable线程2取钱
        BankDrawRunner bankDrawRunner1=new BankDrawRunner(bankAccount,1500);
        new Thread(bankDrawRunner,"draw balance thread 1").start();
        new Thread(bankDrawRunner1,"draw balance thread 2").start();
        }
}
