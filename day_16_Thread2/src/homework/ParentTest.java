package homework;

/**
 *主线程结束其他线程一样可以运行
 *
 */
public class ParentTest {
    public static void main(String[] args) {
        Thread t1;
        System.out.println("main thread start");
        t1=new Thread(()->{
            System.out.println("child thread start");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("child thread over");
        });
        t1.setDaemon(true);
        t1.start();

        System.out.println("main thread over");
    }
}
