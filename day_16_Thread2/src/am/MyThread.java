package am;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    private static int ticket = 100;
    private static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (ticket > 0) {
//            lock.lock();
            if (lock.tryLock()) {
                if (ticket > 0) {
                    System.out.println(getName() + "正在卖出第" + ticket + "张票！");
                    ticket--;
                    throw new RuntimeException();
                }
                lock.unlock();
            }else{
                System.out.println("没有获得锁");
                ticket=0;
            }
        }
    }

    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
    }
}
