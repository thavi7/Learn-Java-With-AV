package BasicsOfGen;

public class Main {
    public static void main(String[] args) {
        Box<Integer> box =new Box<>();
        box.setValue(1);
        int i= (Integer) box.getValue();
        System.out.println(i);

        Pair<String, Integer> pair = new Pair<>("Age", 30);


    }
}
