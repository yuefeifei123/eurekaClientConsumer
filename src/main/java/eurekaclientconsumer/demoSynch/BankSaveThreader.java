package eurekaclientconsumer.demoSynch;

public class BankSaveThreader extends Thread {
    BankAccount bankAccount;
    Integer balance;
    //使用账户和需要取的钱的数量进行初始化：
    public BankSaveThreader(BankAccount bankAccount, Integer balance)
    {
        this.bankAccount=bankAccount;
        this.balance=balance;
    }

    @Override
    public void run() {
        synchronized (bankAccount){
        //调用账户的取钱方法
        bankAccount.saveBalance(balance);
    }

    }
}
