class A{
   public A()
    {super(); //extends to object class
        System.out.println("In A");
    }
    public A(int n)
    {super();
        System.out.println("In A parameterized");
    }
}
class B extends A{
    public B()
    {
        super();
        System.out.println("In B");
    }
    public B(int n)
    { this(); // calling the con of same class
        System.out.println("In B parameterized");
    }
}
public class This_03 {
    public static void main(String[] args) {
       
         B obj1=new B(23);
    }
}
