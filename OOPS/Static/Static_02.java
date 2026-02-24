


class Mobile{
    String brand;
    int price;
    static String name;

    public static void StaticMethod(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }

    public void show() 
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
    
}
public class Static_02 {
    public static void main(String[] args) throws Exception  {
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        Mobile.name="Smartphone";

        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=1200;
        Mobile.name="Smartphone";

        
        // obj1.show();
        // obj2.show();
       
        Mobile.StaticMethod(obj1);

   




    }
}
