package homework;

public class Task1 {
    private static int bricksNum = 0;
    private static int count = 0;
    private static Object object = new Object();

    public static void main(String[] args) {


        //工厂生产线程
        Thread factory = new Thread("我是工厂生产线程") {
            @Override
            public void run() {
                System.out.println("开始生产砖");
                synchronized (object) {
                    for (int i = 0; i < 20; i++) {
                        System.out.println("正在生产第" + ++bricksNum + "块砖");
                        count++;
                        if (count == 20) {
                            System.exit(0);
                        }
                        if (bricksNum % 5 == 0) {
                            System.out.println("砖装满了,等待拉车来拉");
                            object.notify();
                            try {
                                object.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        };

        //拉车拉砖线程
        Thread dragBricks = new Thread("我是拉车线程") {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("开始拉车线程");
                while (true) {
                    synchronized (object) {
                        System.out.println("正在拉第" + bricksNum + "块砖");
                        bricksNum--;
                        if (bricksNum == 0) {
                            System.out.println("砖拉完了,开始等待生产");
                            object.notify();
                            try {
                                object.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        };


        factory.start();
        dragBricks.start();

    }
}
