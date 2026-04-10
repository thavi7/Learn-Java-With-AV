package Basics;

public class Test {
        public static void main(String[] args) {
/*To create a new thread in java you can either extend Thread class ir implement runable interface*/

            World world=new World();

            // world.start();
/* Creates a new thread Then JVM internally calls run() Runs parallel to main thread*/

            Thread t1=new Thread(world);
            t1.start();

/*A new class world created that implements runnable, then run method is overriden, a thread obj is created by passing
an instance of myrunnable,start method is called on thread to initiate the new thread*/

            for (int i = 0; i < 100000; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }












    /*
    public class A extends B implements Runnable{

    @Override
    public void run() {

    }
}
     */