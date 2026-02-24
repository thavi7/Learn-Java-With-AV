class Calculator  // its a class
{
    int a;  //its a var

    public int add(int n1, int n2)  //its a method
    {
        int r=n1+n2;
        System.out.println("int add");
        return r;
    }
}

public class Object_01 {
    public static void main(String[] args) {
        int n1=4,n2=5;
        
        Calculator Calc = new Calculator(); //creating new object
        
        int res= Calc.add(n1,n2);
        System.out.println(res);
    }
}


