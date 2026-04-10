package MemberInner_Class;

public class Car {
    public  String model;
    private boolean isengineOn;

    public Car(String model){
        this.model=model;
        this.isengineOn=false;
    }

    class Engine{
        void start(){
            if(!isengineOn){
                isengineOn=true;
                System.out.println(model+" engine started");
            }else {
                System.out.println(model + " engine is on");
            }

        }
        void stop(){
            if(isengineOn){
                isengineOn=false;
                System.out.println(model+" engine stopped");
            }else {
                System.out.println(model + " engine is off");
            }
        }
    }
}
