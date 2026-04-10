import java.io.FileNotFoundException;
import java.io.FileReader;

public class Finally {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(Div(1,0));
        System.out.println("hello");
    }
    public static int Div(int a,int b){
     try{
         return a/b;
     } catch (Exception e) {
        return -1;
     } finally { //always run even if we return
        System.out.println("Bye..");
     }
    }


}
