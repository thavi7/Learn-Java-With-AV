package Static;

class Mobile{
    String brand;
    int price;
    static String name;


    static //Static block for innitiallize the static values once
    {
        name="Smartphone";
        System.out.println("static block");
    }

    public Mobile() //constructor for innitiallize the values
    {
        brand="NULL";
        price=200;
        System.out.println("Constructor");
    }

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}
public class Static_01 {
    public static void main(String[] args) throws Exception  {
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        Mobile.name="Smartphone";

        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=1200;
        Mobile.name="Smartphone";

        Mobile obj3=new Mobile();
        obj3.brand="Xiome";
        obj3.price=1000;
        Mobile.name="Smartphone";

  Mobile.name="Phone";
   
        obj1.show();
        obj2.show();
        obj3.show();




     Class.forName("Mobile");
   




    }
}
