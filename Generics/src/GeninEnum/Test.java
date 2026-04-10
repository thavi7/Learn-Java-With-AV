package GeninEnum;
enum Operation {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    public <T extends Number> double apply(T a, T b) {
        if (this == ADD) {
            return a.doubleValue() + b.doubleValue();
        } else if (this == SUBTRACT) {
            return a.doubleValue() - b.doubleValue();
        } else if (this == MULTIPLY) {
            return a.doubleValue() * b.doubleValue();
        } else if (this == DIVIDE) {
            return a.doubleValue() / b.doubleValue();
        }
        throw new AssertionError("Unknown operation: " + this);
    }
}
public class Test {
    public static void main(String[] args) {
      double res1=  Operation.ADD.apply(10,20);
        System.out.println(res1);
    }
}
