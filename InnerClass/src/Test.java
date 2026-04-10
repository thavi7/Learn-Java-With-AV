public class Test {
    public static void main(String[] args) {
//        Car car=new Car("BMW");
//        Car.Engine engine=car.new Engine();
//        engine.start();
//        engine.stop();

//        Computer comp=new Computer("hp","ABC","Windows");
//    comp.getOS().displayInfo();
//
//    Computer.USB usb=new Computer.USB("Type C");

//        ShoppingCart shoppingCart=new ShoppingCart(150);
//
//        shoppingCart.ProcessPayment(new Payment() {
//            @Override
//            public void pay(double ammount) {
//                System.out.println("Paid "+ammount+" using creditcard...");
//            }
//        });

        Hotel hotel=new Hotel("Sunshine",10,5);
        hotel.ReserveRooms("Avi",1);
        hotel.ReserveRooms("Sayan",15);
    }

}
