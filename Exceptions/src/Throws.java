import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Throws {
    public static void main(String[] args) throws FileNotFoundException {
    method2();
        System.out.println("hello");
    }
    public static void  method2() throws FileNotFoundException {
       method1();
    }
    public static void  method1() throws FileNotFoundException {
        try {
            FileReader fileReader=new FileReader("A.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
        throw new FileNotFoundException("Opps"); //forcefully exception thow krne k liye
        }
    }
}
