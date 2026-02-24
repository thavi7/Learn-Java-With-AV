
class Comp{

}
class lap extends Comp{

}
class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A{
     public void show(){
        System.out.println("in B show");
    }
}

public class dynamic {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();

        obj=new B();
        obj.show();

        Comp obj1=new lap();
    }
}
