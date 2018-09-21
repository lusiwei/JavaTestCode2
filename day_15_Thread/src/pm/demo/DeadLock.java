package pm.demo;

public class DeadLock implements Runnable {
    private Object lock1=new Object();
    private Object lock2=new Object();

    @Override
    public void run() {
        while (true){

            synchronized (lock1){
                System.out.println(Thread.currentThread().getName()+"正在进入锁一");
                synchronized (lock2){
                    System.out.println("正在进入锁二");
                }
            }
            synchronized (lock2){
                System.out.println(Thread.currentThread().getName()+"正在进入锁二");
                synchronized (lock1){
                    System.out.println("正在进入锁一 ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Runnable r= new DeadLock();

        new Thread(r,"线程一").start();
        new Thread(r,"线程二").start();
    }
}
