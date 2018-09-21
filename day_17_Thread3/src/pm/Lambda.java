package pm;

public class Lambda {
    public static void main(String[] args) {
        new Thread(()-> System.out.println("线程启动了")).start();
        LambdaDemo demo1=(x,y)->x+y;
        System.out.println(demo1.sum(1,3));
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"启动了");
        }).start();
    }
}

interface LambdaDemo{
    int sum(int x,int y);
}
