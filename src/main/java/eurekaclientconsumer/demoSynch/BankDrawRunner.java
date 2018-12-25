package eurekaclientconsumer.demoSynch;

public class BankDrawRunner implements Runnable {
    //银行账户
    private BankAccount bankAccount;
    //取钱数
    private Integer drawBalance;

    public BankDrawRunner(BankAccount bankAccount, Integer drawBalance)
    {
        this.bankAccount=bankAccount;
        this.drawBalance=drawBalance;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            bankAccount.drawBalance(drawBalance);
        }
    }

}
