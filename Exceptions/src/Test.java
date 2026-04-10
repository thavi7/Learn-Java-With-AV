public class Test {
    public static void main(String[] args) {
        BankAcc bankAcc=new BankAcc(10);
        try{
            bankAcc.withdraw(11);
        } catch (InsuffFundEx e) {
            System.out.println(e);

        }
    }
}
