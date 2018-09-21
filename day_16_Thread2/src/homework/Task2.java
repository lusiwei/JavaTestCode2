package homework;

/**
 * 循环打印A,B，C
 */
public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1, t2, t3;
        t1 = new Thread(() -> System.out.println("A"));
        t2 = new Thread(() -> System.out.println("B"));
        t3 = new Thread(() -> System.out.println("C"));
        t1.start();
        System.out.println(Thread.currentThread().getName());
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}
