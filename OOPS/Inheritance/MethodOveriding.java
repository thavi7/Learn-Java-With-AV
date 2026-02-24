class A{
    public void Show(){
        System.out.println("in A show");
    }
    public void Config(){
        System.out.println("in A Config");
    }
}
class B extends A{
    public void Show(){
        System.out.println("in B show");
    }
}

public class MethodOveriding {
    public static void main(String[] args) {
        B obj=new B();
        obj.Show();
        obj.Config();
    }
}
