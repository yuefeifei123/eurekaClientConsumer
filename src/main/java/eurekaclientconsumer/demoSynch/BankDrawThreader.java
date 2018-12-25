package eurekaclientconsumer.demoSynch;

public class BankDrawThreader extends Thread {
    BankAccount bankAccount;
    Integer balance;
    //使用账户和需要取的钱的数量进行初始化：
    public BankDrawThreader(BankAccount bankAccount, Integer balance)
    {
        this.bankAccount=bankAccount;
        this.balance=balance;
    }

    @Override
    public void run() {

            //调用账户的取钱方法
            bankAccount.drawBalance(balance);


    }
}
