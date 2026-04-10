package AccessModifiers.Zoo;

public class Dog extends Animal{
    public  Dog(String name){
        super(name,"Bark..");
    }
    public void wagTail(){
        System.out.println(getName()+" is wagging");
    }
    private String getName(){
        return getClass().getSimpleName();
    }

}
