package ModifiedObjclass;
class A{
    public void show1(){
        System.out.println("in A show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("in B show");
    }
}

public class Upcasting02 {
    public static void main(String[] args) {
       
        A obj1=(A)new B();
        obj1.show1();
        B obj2=(B)new B();
        obj2.show2();

       
    }
}
