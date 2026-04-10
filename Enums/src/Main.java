
public class Main {

public  enum Months{
    JAN,FEB,MAR,AP;
}

    public static void main(String[] args) {
//        System.out.println(Day.FRIDAY);
//        System.out.println(Day.MONDAY);
            Day monday = Day.MONDAY;
//        int ordinal = monday.ordinal();
//        System.out.println(ordinal); //idx of monday
//        String name = monday.name();
//        System.out.println(name);
//        monday.toString().toUpperCase();
//        Day enumday=  Day.valueOf("MONDAY");
//        System.out.println(enumday);

//        for (Day value : Day.values()) {
//            System.out.println(value);
//        }

     //   System.out.println(monday.display());
        System.out.println(monday.getLower());
        System.out.println(Months.JAN);
    }
}