package SynchronizationndLocks;

public class MyThread extends Thread{
    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.inc();
        }
    }
}
/* let say c=101, then
t1 will makw it 102.. but it may happens t1 and t2 both read c as 101 so both inc same time
and make it 102, so itll not 103 itll 102 by both
if we use synchronised then 1 will complete at 1 time then another
 */