public class BankAcc {
    private double balance;

    public BankAcc(double amount) {
        this.balance = amount;
    }
    public void withdraw(double amount) throws InsuffFundEx {
        if(amount>balance){
            throw  new InsuffFundEx(amount);
        }
        balance-=amount;
    }
}
