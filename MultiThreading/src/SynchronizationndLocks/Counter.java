package SynchronizationndLocks;

public class Counter {
    private  int count=0;
    public  void inc(){
//Critical section --> shared res access and modify..
        synchronized (this){
            count++;
        }
    }

    public int getCount() {
        return count;
    }




}
/*lock
1)intrinsic --> built into every obj in java, when use synchronised they r beign used
2)explicit --> adv locks, control by ourselve using lock class, java.util.concurrent.lock
 */