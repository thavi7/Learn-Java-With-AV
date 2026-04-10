package Basics;

public class MyThread_03 extends Thread{
    public MyThread_03(String name) {
        super(name);
    }

    @Override
    public void run() {
//        try{
//            Thread.sleep(1000);
//            System.out.println("Thread is running");
//        } catch (InterruptedException e) {
//            System.out.println("Thread Interruped e"+e);
//        }
//        for (int i = 1; i <=5; i++) {
//            System.out.println(Thread.currentThread().getName()+" Thread is running");
//            Thread.yield(); //will give each thread a chance
//        }

        while (true){
            System.out.println("Hello bro");
        }
    }

    public static void main(String[] args) {
        MyThread_03 t1 =new MyThread_03("t1");
        t1.setDaemon(true);
        t1.start();
        MyThread_03 t2 =new MyThread_03("t2");
       t2.start();


//        t1.interrupt(); //will stop sleep wait those shit...
        System.out.println("main done");
    }
}
