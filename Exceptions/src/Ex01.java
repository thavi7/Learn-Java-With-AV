public class Ex01 {
//we can use multiple catch but if parent class is on top then ex will catch at there nahhhh so we dont have to do that
    public static void main(String[] args) {
        int[]x={10,200,30,40};
        int[]y={1,2,0,4};
        for (int i = 0; i < 10; i++) {
           try{
               System.out.println(divide(x[i],y[i]));
           }catch (Exception e){
               System.out.println(e);
           }
        }
        System.out.println("sabbasss... ");
    }
    public static int divide(int a,int b){
        try {
            return a/b;
        }
        catch (NullPointerException e){
            System.out.println("Null aya geya vai");
            return -1;
        } catch (ArithmeticException e) {
            System.out.println("Arithmatic wala vai");
            return -1;
        } catch (Exception e) {
            System.out.println("vai ye keya horaha"+ e);
            return -1;
        }
    }
}
