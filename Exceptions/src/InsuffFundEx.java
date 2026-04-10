// for custom exception we have to extends exception
public class InsuffFundEx extends  Exception {
    private  double amount;
    public InsuffFundEx(double amount) {
        super("What bro, earn money");
        this.amount=amount;
    }

    public double getAmount() {
        return amount;
    }
}
