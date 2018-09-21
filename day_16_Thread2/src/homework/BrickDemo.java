package homework;

public class BrickDemo {
    Object obj[] = new Object[5];
    int index=0;

    public synchronized void push(Object o){
        if(index==5){
            try {
                System.out.println("装满了等待");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        obj[index]=o;
        this.notify();
        index++;
    }

    public synchronized Object pop(){
        if(index==0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Object o = obj[index-1];
        this.notify();
        this.index--;
        return o;
    }
    public static void main(String[] args){
        BrickDemo brickDemo= new BrickDemo();
        new Thread(new PushDemo(brickDemo)).start();
        new Thread(new PopDemo(brickDemo)).start();
    }

}
class PushDemo implements Runnable{
    BrickDemo brickDemo;
    public PushDemo(BrickDemo brickDemo){
        this.brickDemo=brickDemo;
    }
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            brickDemo.push("第"+i+"块砖");
            System.out.println("放入第"+i+"块砖");
        }
    }
}
class PopDemo implements Runnable{

    BrickDemo brickDemo= new BrickDemo();

    public PopDemo(BrickDemo brickDemo){
        this.brickDemo=brickDemo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("取出"+brickDemo.pop());
        }
    }
}
