abstract class A {
    public abstract void show();
}

public class Abs_Ann {
    public static void main(String[] args) {
        A obj=new A() {
           public void show(){
            System.out.println("int new show");
           }
        };
        obj.show();;
    }
}
