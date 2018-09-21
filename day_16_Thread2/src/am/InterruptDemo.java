package am;

public class InterruptDemo {
    public static void main(String[] args) {
        Thread baJie=new Thread(){
            @Override
            public void run() {
                System.out.println("化缘。。。");
                try {
                    Thread.sleep(1000000);
                } catch (InterruptedException e) {
                    System.out.println("被孙悟空一棒子敲醒!!!");
                    e.printStackTrace();
                }
            }

        };

        Thread wuKong=new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("找猪八戒");
                baJie.interrupt();
            }
        };

        baJie.start();
        wuKong.start();
    }
}
