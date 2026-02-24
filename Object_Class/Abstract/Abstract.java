package Abstract;

abstract class Car{
    public abstract void driver();
    public void playmusic(){
        System.out.println("play music");
    }
}
class lambo extends Car{
    public void driver(){
        System.out.println("Driving");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Car obj=new lambo();
        obj.driver();
        obj.playmusic();
    }
}
