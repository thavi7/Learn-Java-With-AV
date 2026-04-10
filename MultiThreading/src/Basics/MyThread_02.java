package Basics;

public class MyThread_02 extends Thread{

    public MyThread_02(String name){
        this.setName(name);
    }

    @Override
//run() is used to define the task that a new thread will perform
    public void run() {

        for (int i = 1; i <=5; i++) {

System.out.println(Thread.currentThread().getName()
        +" - Priority: "+ Thread.currentThread().getPriority()
        +" - count: "+ i);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
    MyThread_02 t1=new MyThread_02(" THREAD LOW");
    MyThread_02 t2=new MyThread_02(" THREAD MEDIUM");
    MyThread_02 t3=new MyThread_02(" THREAD HIGH");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();

//    t1.join();
    }
}

// start run sleep join setPriority interrupt yield setDaemon