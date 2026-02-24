
class Computer
{
    public void playMusic(){
        System.out.println("Music Played");
    }
    public String getMePen(int cost){
       if(cost>=10) return "pen";
       else return "Nothing";
    }
}


public class Methods_02 {
    public static void main(String[] args) {
        
        Computer Comp = new Computer();

        Comp.playMusic();
        String str=Comp.getMePen(10);
        System.out.println(str);
    }
}
