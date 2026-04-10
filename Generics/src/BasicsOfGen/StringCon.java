package BasicsOfGen;

public class StringCon implements Container<String> {

    private String item;

    @Override
    public void add(String item) {
        this.item=item;
    }

    @Override
    public String get() {
        return "";
    }
}
