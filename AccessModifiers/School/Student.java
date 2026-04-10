package AccessModifiers.School;

/*
public -->> anywhere
private -->> class mai only accesable
default -->> same package
protected -->>only those class who extendes this class, same package
*/

public class Student {
  public String name;
  public int age;

  private  Student(){

  }

  public void sayhello(){
    System.out.println("hellooooo");
  }
}
