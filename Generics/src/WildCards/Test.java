package WildCards;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//we will use wildcard when we r not returning anything just read only
public class Test {
    public  void printArr(ArrayList<?> list){
        for (Object o:list){
            System.out.println(o);
        }
//        return list.get(0);
    }

    public static double sum(List<? extends Number> number) { //upperbound.. number ki niche wale class
        double sum=0;
        for(Number o:number)
        {
            sum+=o.doubleValue();
        }
        return sum;
    }
    public static void printNumbers(List<? super Integer> list) { //lowerbound.. interger k upar wale class
        for (Object obj:list){
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList(1,2,34)));
    }
}
