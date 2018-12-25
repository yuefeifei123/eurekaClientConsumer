package eurekaclientconsumer.demoSynch;

/**
 * @author 24569
 */
public class BankMainWaitTest {
    public static void main(String[] args){
        //初始化账户有3000余额
        BankAccount bankWaitAccount=new BankAccount(0);

        //runnable线程1取钱
        BankDrawRunner bankDrawRunner=new BankDrawRunner(bankWaitAccount,800);
        //runnable线程2取钱
        BankSaveRunner bankSaveRunner=new BankSaveRunner(bankWaitAccount,800);
        new Thread(bankSaveRunner,"小明在存钱").start();
        new Thread(bankDrawRunner,"小明在取钱").start();

    }
}
