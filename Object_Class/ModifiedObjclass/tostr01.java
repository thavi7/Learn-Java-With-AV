package ModifiedObjclass;
class Laptop{
    String model;
    int price;

    public String toString(){
        return "hello";
    }
    public boolean equals(Laptop that)
    {
        return (this.model.equals(that.model) && this.price==that.price);
    }
}
public class tostr01 {
     public static void main(String[] args) {
        Laptop obj1=new Laptop();
        obj1.model="lenevo";
        obj1.price=1000;

        Laptop obj2=new Laptop();
        obj2.model="lenevo";
        obj2.price=1000;
boolean result= obj1.equals(obj2);
            System.out.println(result);

    }
}
