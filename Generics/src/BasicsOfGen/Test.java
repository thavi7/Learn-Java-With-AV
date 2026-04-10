package BasicsOfGen;

interface  printable{
    void print();
}
class Mynumber extends Number implements printable{
    private final int value;

    Mynumber(int value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }

    @Override
    public void print() {
        System.out.println("MyNumber: "+ value);
    }
}

class Boxx<T extends  Number & printable>{  //only those classes can come to T who implements
    // Printable and extends Number (like our MyNumber) ***first class then interface
    private T item;

    public Boxx(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
    public void display() {
        item.print();
    }
}


public class Test {
    public static void main(String[] args) {
        Mynumber mynumber=new Mynumber(12);
        Boxx<Mynumber> boxx=new Boxx<>(mynumber);
        boxx.display();
    }
}