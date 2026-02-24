
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
        super(5);
        System.out.println("In B");
    }
    public B(int n)
    {super(n);   //not passing any value to superclass
        System.out.println("In B parameterized");
    }
}
public class Super_02 {
    public static void main(String[] args) {
        B obj=new B();
        // B obj1=new B(23);
    }
}
