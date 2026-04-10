package GeninConstructor;
//no need to make class gen but method is gen
public class Box2 {
    public <T extends Number> Box2(T value) {

    }

    public static void main(String[] args) {
        Box2 box2=new Box2(3);
    }
}
