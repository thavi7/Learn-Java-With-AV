public class StackTrace {
    public static void main(String[] args) {
    try {
        lvl1();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
    public static void lvl3(){
        int[]a = new int[5];
        a[5] = 10;
    }
    public static void lvl2(){
        lvl3();
    }public static void lvl1(){
        lvl2();
    }

}