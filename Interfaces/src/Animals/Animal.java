package Animals;/*
Blueprint for clasess,abstract methods,by default static final,default methods,static methods and static constants...
multiple inheritance support
*/

public interface Animal {
    public static final int MAX_AGE=150;
    public abstract void eat();
    void sleep();

//we can static method...
    public static void info(){
        System.out.println("This is an animal interface");
    }

    default void run(){
        this.eat();
        System.out.println("Animal is running");
    }










}
