public enum Day {

    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private Day(String lower)
    {
        System.out.println("Holaaaa");
        this.lower=lower;
    }
    private String lower;

    public String getLower() {
        return lower;
    }
//default field name,ordinal
    public String display(){
        return "Today is "+this.name();
    }
}
