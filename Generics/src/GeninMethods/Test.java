package GeninMethods;

public class Test {
    public static void main(String[] args) {

    Integer[] arr={1,2,3,4};
    methodArr(arr);
    }
    public <T> void methodName(T parameter){
        // method body
    }
    public static  <T> void methodArr(T[] Arr){
        for (T element : Arr){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
