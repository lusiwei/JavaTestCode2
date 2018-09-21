package am.demo;

public class TestThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("我的线程");
        myThread.start();
        for (int i = 0; i <100; i++) {
            System.out.println("我是main线程"+i);
        }
    }
}
