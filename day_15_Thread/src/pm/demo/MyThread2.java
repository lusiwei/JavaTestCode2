package pm.demo;

public class MyThread2 implements Runnable {
    int ticket=100000000;
    @Override
    public void run() {
        while (ticket>0){
            synchronized(String.class){
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket--+"张票");
                }
            }
        }
    }

    public static void main(String[] args) {
        Runnable r = new MyThread2();

        //线程1
        new Thread(r,"线程一").start();
        new Thread(r,"线程二").start();
        new Thread(r,"线程三").start();

    }
}
