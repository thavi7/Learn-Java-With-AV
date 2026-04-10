package SynchronizationndLocks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private final Lock lock=new ReentrantLock();

    private int balance=100;
    public void WithDraw(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+
                " attempting to withdraw "+
                amount);
        if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
            System.out.println("hola");
        }

    }
}
