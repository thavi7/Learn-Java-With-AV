class Human{
    private int age;
    private String name;
    //Constructor 

    public Human(){
        age=12; 
        name="Avi";
        System.out.println("hi");
    }
    public Human(int age , String name)
    {
       this.age=age;
       this.name=name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        this.age = a; 
    }  
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class Con_01 {
    public static void main(String[] args) {
        Human obj1=new Human();
        Human obj2=new Human(18,"Mehek");
        System.out.println(obj2.getAge()+":"+obj2.getName());
        
       
    }
}
