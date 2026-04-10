
abstract class Animal {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void SayHello();

    public void sleep() {
        System.out.println("zzz...");
    }
}

class Dog extends Animal {
    @Override
    void SayHello() {
        System.out.println("Woof!");
    }
}
class Cat extends Animal {
    @Override
    void SayHello() {
        System.out.println("Meoww!");
    }
}

public class Abs {
    public static void main(String[] args) {
        Animal dog=new Dog();
        dog.SayHello();
    // Animal animal =new Animal() ;
    }
}
