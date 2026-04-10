public class CreditcardV0 implements Payment{

    @Override
    public void pay(double ammount) {
        System.out.println("Paid "+ammount+" using creditcard...");
    }
}
