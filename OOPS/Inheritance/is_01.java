
class Calc{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
  
}
class Avd_Calc extends Calc{
    public int mul(int a,int b)
    {
        return a*b;
    }
    public int div(int a,int b)
    {
        return a/b;
    }
}
class Very_adv_calc extends Avd_Calc{
    public double Power(int a,int b)
    {
        return Math.pow(a, b);
    }
}

public class is_01 {
    public static void main(String[] args) {
       
        Very_adv_calc  obj=new Very_adv_calc();

        int r1=obj.add(10, 2);
        int r2=obj.sub(10, 2);
        int r3=obj.mul(10, 2);
        int r4=obj.div(10, 2);
        int r5=(int)obj.Power(10, 2);

        System.out.println(r1+ " " + r2+" "+r3+" "+r4+ " "+r5);
    }
}
