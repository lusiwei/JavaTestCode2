package pm;

public class PrintABC {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        new Thread(myThread,"线程一").start();
        new Thread(myThread,"线程二").start();
        new Thread(myThread,"线程三").start();
    }
    static class MyThread implements Runnable {
        static int state;//0打印a,1打印b,2打印c
        private static Object object=new Object();
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                synchronized (object) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    switch (state%3) {
                        case 0:
                            System.out.println(Thread.currentThread().getName()+":"+"A");
                            break;
                        case 1:
                            System.out.println(Thread.currentThread().getName()+":"+"B");
                            break;
                        case 2:
                            System.out.println(Thread.currentThread().getName()+":"+"C");
                            break;
                    }
                    state++;
                }
            }
        }
    }
}
