package am;

public class JoinDemo {
    public static void main(String[] args) {


        Thread t1=new Thread("下载线程"){
            @Override
            public void run() {
                System.out.println("开始下载图片");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 100; i++) {
                    System.out.println(getName()+"正在下载：%"+i);
                }
            }
        };
        Thread t2=new Thread("展示图片进程"){
            @Override
            public void run() {
                System.out.println("开始展示图片");
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("成功展示图片");
            }
        };

        t1.start();
        t2.start();
    }
}
