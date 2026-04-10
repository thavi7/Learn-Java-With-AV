import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Devices.SmartPhone;

public class Test {
    public static void main(String[] args) {
        Animal dog=new Dog();
        //dog.eat();
        Animal cat=new Cat();
        //cat.eat();

       // System.out.println(Dog.MAX_AGE);
       // System.out.println(Animal.MAX_AGE);
       // Animal.info(); //only for interfaces
        //Dog.info();

       // Animal.run(); //will not gonna work since not static
//        dog.run();
//        cat.run();


        SmartPhone sp=new SmartPhone();
        sp.makeCall("123456");
        sp.endCall();
        sp.playMusic();
        sp.stopMusic();
        sp.takePhoto();
        sp.recordVideo();

    }
}
