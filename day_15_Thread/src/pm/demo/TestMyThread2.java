package pm.demo;

public class TestMyThread2 {
    public static void main(String[] args) {
        Runnable r = new MyThread2();
        Thread t=new Thread(r,"我的线程");
        t.start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+i);

            }
        },"线程二").start();
    }
}
