public class ShoppingCart {
    private double TotalAmmount;

    public ShoppingCart(double totalAmmount) {
        TotalAmmount = totalAmmount;
    }
    public void ProcessPayment(Payment paymentmethod){
        paymentmethod.pay(TotalAmmount);
    }
}
