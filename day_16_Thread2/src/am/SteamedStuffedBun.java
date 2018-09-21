package am;

public class SteamedStuffedBun {
    private static int num = 0;
    private static Object object = new Object();

    public static void main(String[] args) {
        Thread production = new Thread("包子铺线程") {
            @Override
            public void run() {
                synchronized (object) {
                    for (int i = 1; i <= 20; i++) {
                        System.out.println("正在生产第" + ++num + "个包子");
                        object.notify();
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    object.notifyAll();
                }
            }
        };
        Thread consume = new Thread("吃货线程") {
            @Override
            public void run() {
                synchronized (object) {
                    for (int i = 1; i <= 20; i++) {
                        System.out.println("正在吃第" + num + "个包子");
                        object.notify();
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    object.notifyAll();
                }
            }
        };

        production.setPriority(10);
        production.start();
        consume.start();
    }
}
