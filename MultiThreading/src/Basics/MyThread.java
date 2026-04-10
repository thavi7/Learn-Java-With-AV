package Basics;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("holaa");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("hehe");
    }

    public static void main(String[] args) throws InterruptedException{
        MyThread t1=new MyThread();
        System.out.println(t1.getState());

        t1.start();
        System.out.println(t1.getState());
//        System.out.println(Thread.currentThread().getState());

        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());



    }
}
