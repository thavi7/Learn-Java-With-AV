package AccessModifiers.Zoo;

public class Animal {
    private String name;
    protected  String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }
    public void makesound(){
        System.out.println(name+"makes a sound: "+sound);
    }
    protected void changesound(String newSound){
        this.sound=newSound;
    }
    protected  void setDogsound(String newsound){
        this.sound=newsound;
    }
}
